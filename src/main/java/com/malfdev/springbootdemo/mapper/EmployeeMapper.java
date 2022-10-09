package com.malfdev.springbootdemo.mapper;

import com.malfdev.springbootdemo.bean.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {
    /**
     * 定义增删改查的方法
     */
    Employee getEmployeeByID(Integer id);
    List<Employee> getAllEmployee();
    void deleteEmployeeById(Integer id);
    void updateEmployee(Employee employee);
    void insertEmployee(Employee employee);
}
