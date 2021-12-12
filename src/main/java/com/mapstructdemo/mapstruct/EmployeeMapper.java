package com.mapstructdemo.mapstruct;

import com.mapstructdemo.controller.EmployeeResponse;
import com.mapstructdemo.model.EmployeeEntity;
import com.mapstructdemo.service.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = CommonMappings.class)
public interface EmployeeMapper {

    // To Application-layer from Domain-layer
    Employee map(EmployeeEntity entity);

    // To Presentation-layer from Application-layer
    @Mapping(target = "seniority", source = "seniorityLevel.levelName")
    @Mapping(target = "fullName", expression = "java(commonMappings.mapFullName(employee.getName(), employee.getSurname()))")
    EmployeeResponse map(Employee employee);
}
