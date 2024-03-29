package com.codeclan.example.employeetracking.controllers;

import com.codeclan.example.employeetracking.models.Employee;
import com.codeclan.example.employeetracking.repositries.EmployeeRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    EmployeeRepositry employeeRepositry;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepositry.findAll();
    }

    @GetMapping("{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeRepositry.findById(id);
    }
}

