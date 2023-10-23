package com.example.employee.service;

import com.example.employee.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService  {
    List<Employee> getAllEmployees();
    void saveEmployee( Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);

}

