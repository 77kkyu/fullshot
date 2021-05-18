package com.example.fullshot.general.login.controller;

import com.example.fullshot.general.commonBoard.model.CommonBoardDTO;
import com.example.fullshot.general.login.model.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
public class LoginController {

    @GetMapping("/main")
    public String aa() {
        return "test";
    }

}
