package com.springboottutorials.demoProject1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {


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

}
