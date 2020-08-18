package com.springboottutorials.demoProject1.controller;

import com.springboottutorials.demoProject1.entity.Address;
import com.springboottutorials.demoProject1.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {

    @Autowired
    @Qualifier("addressServiceImpl")
    AddressService addressService;

    @PostMapping("/saveaddress")
    @ResponseBody
    public Address saveAddress(@RequestBody Address address){
        Address isSaved = addressService.saveAddress(address);
        return address;
    }
}
