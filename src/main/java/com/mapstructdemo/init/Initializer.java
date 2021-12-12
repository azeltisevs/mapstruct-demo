package com.mapstructdemo.init;

import com.mapstructdemo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static com.mapstructdemo.model.LevelName.MANAGING_PRINCIPAL;
import static com.mapstructdemo.model.LevelName.PARTNER;
import static com.mapstructdemo.model.LevelName.SENIOR_CONSULTANT;

@Component
@RequiredArgsConstructor
public class Initializer {

    private final EmployeeService employeeService;

    @PostConstruct
    void init() {
        employeeService.createEmployee("Chuck", "Noland", SENIOR_CONSULTANT);
        employeeService.createEmployee("Marla", "Singer", MANAGING_PRINCIPAL);
        employeeService.createEmployee("Jordan", "Belfort", PARTNER);
    }


}
