package com.malfdev.springbootdemo.controller;

import com.malfdev.springbootdemo.bean.Employee;
import com.malfdev.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping(value = "/emp")
    @ResponseBody
    public Object employeeOp(String op,Integer id,String lastname,String gender ,String email){
        Employee employee = new Employee(id, lastname, gender, email);

        System.out.println("EmployeeController.employeeOp");
        System.out.println("op = " + op);

        switch (op) {
            case "select" :
                Employee employeeByID = employeeService.getEmployeeByID(id);
                return employeeByID == null ? "查无此人":employeeByID;
            case "insert" :
                employeeService.insertEmployee(employee);
                return "插入成功";
            case "delete" :
                employeeService.deleteEmployeeById(id);
                return "删除成功";
            case "update" :
                employeeService.updateEmployee(employee);
                return "更新成功";
            default:return "异常";

        }


    }

    @RequestMapping(value = "/getAllEmp")
    @ResponseBody
    public List<Employee> displayAllEmployees(){
        List<Employee> allEmployee = employeeService.getAllEmployees();
        return allEmployee;
    }

}
