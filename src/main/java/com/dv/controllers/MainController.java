package com.dv.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping(value = "/")
    public String printMessage(Model model){
        model.addAttribute("message", "if you're seeing this that means program is working properly!");
        return "main";
    }
}
