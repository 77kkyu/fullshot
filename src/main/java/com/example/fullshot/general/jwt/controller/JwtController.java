package com.example.fullshot.general.jwt.controller;

import com.example.fullshot.general.jwt.service.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@Controller
public class JwtController {

    private final JwtService jwtService;

    @PostMapping("/jwt/create")
    public String createJwt(HttpServletRequest request) throws Exception {
        return jwtService.makeJwt(request);
    }

    @GetMapping("/jwt/auth")
    public boolean authToken(HttpServletRequest request) throws Exception {
        String jwt = request.getParameter("jwt");

        if( jwt == null ) {
            return false;
        }else {
            return  jwtService.checkJwt(jwt);
        }

    }

}
