package com.malfdev.springbootdemo.mapper;

import com.malfdev.springbootdemo.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    /**
     * 定义增删改查的方法
     */
    Employee getEmployeeByID(Integer id);
    List<Employee> getAllEmployees();
    void deleteEmployeeById(Integer id);
    void updateEmployee(Employee employee);
    void insertEmployee(Employee employee);
}
