package com.malfdev.springbootdemo.mapper;

import com.malfdev.springbootdemo.bean.Employee;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EmployMapperPlus {
    /**
     * 使用mybatisPlus
     * 定义增删改查的方法,使用注解的方式实现
     * 不在使用xxxMapper.xml 配置文件
     * 仍需要在全局的配置文件中注册
     */
    @Select("select * from tbl_employee where id = #{id}")
    Employee getEmployeeByID(Integer id);

    @Select("select * from tbl_employee")
    List<Employee> getAllEmployees();

    @Delete("delete  from tbl_employee where id=#{id}")
    void deleteEmployeeById(Integer id);

    @Update("update tbl_employee set last_name=#{lastName} , gender=#{gender} ,email=#{email} where id = #{id}")
    void updateEmployee(Employee employee);

    @Insert("insert  into tbl_employee(last_name,gender,email) values(#{lastName},#{gender},#{email})")
    void insertEmployee(Employee employee);
}
