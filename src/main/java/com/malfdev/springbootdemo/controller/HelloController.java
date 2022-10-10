package com.malfdev.springbootdemo.controller;

import com.malfdev.springbootdemo.bean.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

    /**
     * @controller 注解表示这个类是一个控制器类
     * @RestController 表示整个类是是控制器类，并为类中的所有方法都加上@ResponseBody
     */
@Controller
public class HelloController {
    /**
     * @RequestMapping 注解 用来标识 页面的连接请求的是那个方法，也可以将其加在类的上方
     * @return
     */
    @RequestMapping(value = "/hello")
    public String handle1(){
        System.out.println("到达controller");
        return "/emp.html";
    }

    /**
     * 返回数据给前端
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/requestSimpleData")
    public String handle2(){
        System.out.println("返回一个简单的数据");
     return "我靠";
    }

    /**
     * 返回数据给前端，返回类型为非基本数据类型，以json的形式返回
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/requestComplexData")
    public Employee handle3(){
        System.out.println("返回一个复杂数据，对象");
        return new Employee(1,"tom","male","malfdev@gmail.com");
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
