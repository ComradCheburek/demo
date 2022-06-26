package com.demo.demo.controller;


import com.demo.demo.repo.entityes.Employee;
import com.demo.demo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/employee/all")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id){

        
    }
}
