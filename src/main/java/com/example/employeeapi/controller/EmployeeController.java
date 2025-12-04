package com.example.employeeapi.controller;

import com.example.employeeapi.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return List.of(
                new Employee(1, "John", "Developer"),
                new Employee(2, "Sara", "Tester"),
                new Employee(3, "Mike", "Manager")
        );
    }
}
