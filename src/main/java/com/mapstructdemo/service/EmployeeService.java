package com.mapstructdemo.service;

import com.mapstructdemo.mapstruct.EmployeeMapper;
import com.mapstructdemo.model.EmployeeEntity;
import com.mapstructdemo.model.EmployeeRepository;
import com.mapstructdemo.model.LevelName;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public void createEmployee(String name, String surname, LevelName seniorityLevel) {
        var entity = new EmployeeEntity();

        entity.setName(name);
        entity.setSurname(surname);
        entity.setSeniorityLevel(seniorityLevel);
        entity.setHireDate(LocalDate.now());

        employeeRepository.save(entity);
    }

    public List<Employee> getAll() {
        return employeeRepository.findAll()
                .stream()
                .map(employeeMapper::map)
                .collect(Collectors.toList());
    }
}
