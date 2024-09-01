package com.trasky.ecommerceapplication.repository;

import com.trasky.ecommerceapplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

}
