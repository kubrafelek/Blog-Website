package com.blog.Blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthenticationController {

    @GetMapping(value = "/")
    public String index(){
        return "index";
    }

    @GetMapping(value = "/registration")
    public String register(){
        return "register";
    }

    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }

}
