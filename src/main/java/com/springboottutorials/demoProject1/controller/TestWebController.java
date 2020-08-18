package com.springboottutorials.demoProject1.controller;

import com.springboottutorials.demoProject1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestWebController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);

        model.addAttribute("employeelist",employeeService.getAllEmployees());
        return "greeting";
    }

}
