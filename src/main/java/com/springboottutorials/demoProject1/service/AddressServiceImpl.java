package com.springboottutorials.demoProject1.service;

import com.springboottutorials.demoProject1.entity.Address;
import com.springboottutorials.demoProject1.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressRepository addressRepository;

    @Override
    public Address saveAddress(Address address) {
        Address add = addressRepository.save(address);
        return add;
    }
}
