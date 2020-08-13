package com.springboottutorials.demoProject1.service;

import com.springboottutorials.demoProject1.entity.Employee;
import com.springboottutorials.demoProject1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
