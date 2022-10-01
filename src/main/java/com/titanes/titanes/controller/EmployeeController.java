package com.titanes.titanes.controller;


import com.titanes.titanes.model.Employee;
import com.titanes.titanes.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    private void createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
    }

    @PutMapping("employee")
    private void updateEmployee(@RequestBody Employee employee){

        employeeService.updateEmployee(employee);
    }

    @GetMapping("/employee")
    private List<Employee> readEmployee(){
        return employeeService.readEmployee();
    }

    @DeleteMapping("/employee/{id}")
    private void deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
    }

}
