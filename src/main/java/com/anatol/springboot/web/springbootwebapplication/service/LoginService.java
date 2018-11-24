package com.anatol.springboot.web.springbootwebapplication.service;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class LoginService {

    public boolean validateUser(String userid, String password) {

        final boolean anatol = userid.equalsIgnoreCase("anatol")
                && password.equalsIgnoreCase("1234");
        return anatol;

    }
}
