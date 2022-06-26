package com.demo.demo.service;

import com.demo.demo.repo.EmployeeRepo;
import com.demo.demo.repo.entityes.Employee;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EmployeeService {

    private final EmployeeRepo employeeRepo;
    public List<Employee> getAll(){
        List<Employee> employeeEntityes=employeeRepo.findAll();
        return employeeEntityes;
    }
}
