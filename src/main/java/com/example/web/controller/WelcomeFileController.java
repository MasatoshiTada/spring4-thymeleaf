package com.example.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WelcomeFileController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "redirect:hello/index";
    }
}
