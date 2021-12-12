package com.mapstructdemo.mapstruct;

import com.mapstructdemo.controller.EmployeeResponse;
import com.mapstructdemo.model.EmployeeEntity;
import com.mapstructdemo.service.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    // To Application-layer from Domain-layer
    Employee map(EmployeeEntity entity);

    // To Presentation-layer from Application-layer
    EmployeeResponse map(Employee employee);
}
