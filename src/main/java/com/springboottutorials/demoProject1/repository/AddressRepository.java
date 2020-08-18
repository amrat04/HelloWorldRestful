package com.springboottutorials.demoProject1.repository;

import com.springboottutorials.demoProject1.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
