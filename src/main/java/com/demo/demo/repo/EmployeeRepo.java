package com.demo.demo.repo;

import com.demo.demo.repo.entityes.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
