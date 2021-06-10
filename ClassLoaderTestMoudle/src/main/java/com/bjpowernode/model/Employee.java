package com.bjpowernode.model;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * 宋秋宇
 * 日期:2021/6/5
 */
@Data
public class Employee {
    @ExcelProperty("ID")
    private Integer id;
    @ExcelProperty("年龄")
    private Integer age;
    @ExcelProperty("姓名")
    private String name;
    @ExcelProperty("性别")
    private String gender;
    @ExcelProperty("入职日期")
    private Date workDate;
    @ExcelProperty("毕业院校")
    private String school;

    public Employee(Integer id, Integer age, String name, String gender, Date workDate, String school) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.workDate = workDate;
        this.school = school;
    }
}
