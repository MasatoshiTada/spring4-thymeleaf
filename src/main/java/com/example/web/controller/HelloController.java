package com.example.web.controller;

import com.example.web.dto.HelloDto;
import com.example.web.form.HelloForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

    @ModelAttribute
    public HelloForm setUpForm() {
        return new HelloForm();
    }

    @GetMapping("/index")
    public String index() {
        return "hello/index";
    }

    @GetMapping("/result")
    public String result(@Validated HelloForm helloForm,
                         BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "hello/index";
        }
        HelloDto helloDto = new HelloDto();
        helloDto.setName(helloForm.getName());
        model.addAttribute("helloDto", helloDto);
        return "hello/result";
    }
}
