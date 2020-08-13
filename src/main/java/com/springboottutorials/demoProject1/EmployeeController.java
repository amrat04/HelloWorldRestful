package com.springboottutorials.demoProject1;

import com.springboottutorials.demoProject1.dto.LoginRequest;
import com.springboottutorials.demoProject1.service.EmployeeService;
import com.springboottutorials.demoProject1.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/hello")
    @ResponseBody
    public String getBaseURL(){

        return "hello world!";
    }

    @GetMapping("/whether/{district}/{datefor}")
    @ResponseBody
    public String exampleWithPathVariable(@PathVariable("district") String district,
                                          @PathVariable("datefor") String dateFor){

        //  HttpMethod.GET; -- This is used for fetching the data.
        //  HttpMethod.POST; -- This is used for saving the data into the system/DB
        //  HttpMethod.PUT;  -- This is used for updating the data into the system/DB
        //  HttpMethod.DELETE; -- This is used for deleting the data into the system/DB
        System.out.println("VAlud of district is "+ district);
        return "Whether Information for "+ district + " is 40";
    }

    @GetMapping("/whether")
    @ResponseBody
    public String exampleWithRequestParameters(@RequestParam("district") String district, @RequestParam("datefor") String datefor){

        return "District ID : "+ district + " for the date : "+datefor;
    }

    @PostMapping("/authenticate")
    @ResponseBody
    public boolean authenticateUser(@RequestBody LoginRequest loginRequest){
        Boolean isAuthenticated = employeeService.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
        return isAuthenticated;
    }

}
