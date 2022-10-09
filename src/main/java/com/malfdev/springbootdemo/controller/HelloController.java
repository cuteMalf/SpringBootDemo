package com.malfdev.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping(value = "/hello")
    public String handle1(){
        System.out.println("到达controller");
        return "/success.html";
    }

    @ResponseBody
    @GetMapping(value = "/onlyGet")
    public String handle4(){
        System.out.println("请求handle4方法");
        return "请求handle4方法";
    }

    @ResponseBody
    @PostMapping(value = "/onlyPost")
    public String handle5(){
        System.out.println("请求handle5方法");
        return "请求handle5方法";
    }

    @ResponseBody
    @PostMapping(value = "/getJson")
    public String handle6(@RequestBody String str){
        System.out.println("请求handle5方法"+str);
        return "请求handle5方法";
    }
}
