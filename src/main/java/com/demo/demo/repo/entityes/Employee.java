package com.demo.demo.repo.entityes;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private Long employeeId;
    private String fullName;
    private Integer employeeType;

}
