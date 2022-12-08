package com.bahrath.springcloud.controller;

import com.bahrath.springcloud.security.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private SecurityService securityService;

    @GetMapping("/")
    public String showLoginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String email, String password) {
        boolean loginRespose = securityService.login(email, password);
        if(loginRespose) {
            return "index";
        } else {
            return "login";
        }
    }
}
