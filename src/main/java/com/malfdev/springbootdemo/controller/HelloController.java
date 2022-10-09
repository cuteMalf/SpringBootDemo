package com.malfdev.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public String handle1(){
        System.out.println("到达controller");
        return "/success.html";
    }
}
