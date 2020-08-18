package com.springboottutorials.demoProject1.service;

import com.springboottutorials.demoProject1.entity.Employee;
import com.springboottutorials.demoProject1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public boolean authenticate(String username, String password) {

        Employee employee = employeeRepository.findByUsernameAndPassword(username, password);

        if(employee == null){
            return false;
        }
        return true;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = employeeRepository.findAll();

        Employee emp = employeeRepository.findById(2).get();

        return list;
    }

    @Override
    public void deleteEmployee(int id) {
        Employee emp = employeeRepository.findById(id).get();
        employeeRepository.delete(emp);
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        Employee e = employeeRepository.save(employee);
        return e;
    }
}
