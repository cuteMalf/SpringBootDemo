package com.malfdev.springbootdemo.service;

import com.malfdev.springbootdemo.bean.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 业务模型
     */
    Employee getEmployeeByID(Integer id);
    List<Employee> getAllEmployees();
    void deleteEmployeeById(Integer id);
    void updateEmployee(Employee employee);
    void insertEmployee(Employee employee);
}
