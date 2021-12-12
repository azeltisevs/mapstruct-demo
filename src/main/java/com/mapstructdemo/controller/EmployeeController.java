package com.mapstructdemo.controller;

import com.mapstructdemo.mapstruct.EmployeeMapper;
import com.mapstructdemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("employee")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @GetMapping("all")
    public ResponseEntity<List<EmployeeResponse>> getAll() {
        List<EmployeeResponse> response = employeeService.getAll()
                .stream()
                .map(employeeMapper::map)
                .collect(Collectors.toList());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
