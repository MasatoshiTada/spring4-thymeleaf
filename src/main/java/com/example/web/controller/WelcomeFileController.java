package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeFileController {
    @GetMapping("/")
    public String index() {
        return "redirect:hello/index";
    }
}
