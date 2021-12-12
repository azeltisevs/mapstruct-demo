package com.mapstructdemo.service;

import com.mapstructdemo.model.LevelName;
import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {

    private Long id;
    private String name;
    private String surname;
    private LevelName seniorityLevel;
    private LocalDate hireDate;
}
