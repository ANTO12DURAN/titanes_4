package com.titanes.titanes.service;

import com.titanes.titanes.model.Employee;
import com.titanes.titanes.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired //se comunica con el repositorio
    EmployeeRepository employeeRepository;

    public void createEmployee(Employee employee){

        employeeRepository.save(employee);
    }
    public List<Employee> readEmployee(){
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.addAll(employeeRepository.findAll());
        return employeeList;
    }
    public void updateEmployee(Employee employee){
        employeeRepository.save(employee);
    }
    public void deleteEmployee(Long id){
        employeeRepository.deleteById(id);
    }
}
