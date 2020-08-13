package com.springboottutorials.demoProject1.repository;

import com.springboottutorials.demoProject1.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    Employee findByUsernameAndPassword(String username, String password);

}
