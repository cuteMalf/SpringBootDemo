package com.malfdev.springbootdemo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer id;
    private String lastName;
    private String gender;
    private String email;
}
