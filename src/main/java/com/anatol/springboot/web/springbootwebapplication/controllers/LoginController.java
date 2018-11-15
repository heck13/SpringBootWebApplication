package com.anatol.springboot.web.springbootwebapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping("/")
    //@ResponseBody
    public String loginMessage() {
        return "login";

    }
}