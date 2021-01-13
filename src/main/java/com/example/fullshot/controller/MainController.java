package com.example.fullshot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/test")
    public String test(Model model) {
        /* 테스트 완료 */
        model.addAttribute("msg", "1000");
        return "home";
    }
}
