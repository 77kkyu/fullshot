package com.example.fullshot.general.jwt.service;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Service;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class JwtService {

    private String secretKey = "ThisisHyoJunSecretKeyWelcomeMyFirstJwt";

    public String makeJwt(HttpServletRequest request) throws Exception {

        SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
        Date expireTime = new Date();
        expireTime.setTime(expireTime.getTime() + 1000 * 60 * 1);
        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secretKey);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

        Map<String, Object> headerMap = new HashMap<String, Object>();
        headerMap.put("typ", "JWT");
        headerMap.put("alg", "HS256");

        Map<String, Object> map = new HashMap<String, Object>();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        map.put("name", name);
        map.put("email", email);

        JwtBuilder jwtBuilder = Jwts.builder().setHeader(headerMap)
                .setClaims(map)
                .setExpiration(expireTime)
                .signWith(signatureAlgorithm, signingKey);

        return jwtBuilder.compact();

    }

    public boolean checkJwt(String jwt) throws Exception {
        try {

            Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary(secretKey))
                    .parseClaimsJws(jwt).getBody(); //정상 수행이 된다면 해당 토큰은 정상 토큰

            return true;

        }catch (ExpiredJwtException exception){
            return false;
        }catch (JwtException exception) {
            return false;
        }

    }

//    makeJwt 메소드를보면 헤더에 alg와 typ를 설정해주었고,
//    클레임에는 비공개클레임으로 간단히 email과 name을 설정해주었다.
//    또한 만료시간으로는 1분으로 잡았다.
//
//
//    아래에 checkJwt메소드에서는 try문에서 받아온 Jwt를 이용하여 파싱을하는데 여기서 파싱이 된다면
//    정상적인 토큰으로 간주하고 여기서 파싱이 되지 않는다면 catch문에 잡힐 것이다.

}
