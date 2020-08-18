package com.springboottutorials.demoProject1.service;

import com.springboottutorials.demoProject1.entity.Address;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceMockImpl implements  AddressService {

    @Override
    public Address saveAddress(Address address) {
        return new Address();
    }
}
