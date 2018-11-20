package com.anatol.springboot.web.springbootwebapplication.service;

public class LoginService {
    public boolean validateUser(String userid, String password) {

        return userid.equalsIgnoreCase("antol")
                && password.equalsIgnoreCase("1234");
    }
}
