package com.malfdev.springbootdemo.service.impl;

import com.malfdev.springbootdemo.bean.Employee;
import com.malfdev.springbootdemo.mapper.EmployeeMapper;
import com.malfdev.springbootdemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public Employee getEmployeeByID(Integer id) {
        System.out.println("通过id查询员工之前做什么");
        Employee employeeByID = employeeMapper.getEmployeeByID(id);
        System.out.println("通过id查询员工之后做什么");
        return employeeByID;
    }

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("查询所有员工之前做什么");
        List<Employee> allEmployee = employeeMapper.getAllEmployees();
        System.out.println("查询所有查询员工之后做什么");
        return allEmployee;
    }

    @Override
    public void deleteEmployeeById(Integer id) {
        System.out.println("根据id删除员工之前干了什么");
        employeeMapper.deleteEmployeeById(id);
        System.out.println("根据id删除员工之后干了什么");
    }

    @Override
    public void updateEmployee(Employee employee) {
        System.out.println("更新员工信息之前干了什么");
        employeeMapper.updateEmployee(employee);
        System.out.println("更新员工信息之后干了什么");
    }

    @Override
    public void insertEmployee(Employee employee) {
        System.out.println("增加一个员工之前干了什么");
        employeeMapper.insertEmployee(employee);
        System.out.println("增加一个员工之后干了什么");
    }
}
