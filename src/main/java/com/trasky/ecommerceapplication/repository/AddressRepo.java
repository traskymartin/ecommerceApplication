package com.trasky.ecommerceapplication.repository;

import com.trasky.ecommerceapplication.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepo extends JpaRepository<Address,Long> {

}