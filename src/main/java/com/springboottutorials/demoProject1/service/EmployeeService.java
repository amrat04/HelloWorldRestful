package com.springboottutorials.demoProject1.service;

import com.springboottutorials.demoProject1.entity.Employee;

import java.util.List;

public interface EmployeeService {

    boolean authenticate(String username, String password);

    List<Employee> getAllEmployees();

    void deleteEmployee(int id);

    Employee saveEmployee(Employee employee);
}
