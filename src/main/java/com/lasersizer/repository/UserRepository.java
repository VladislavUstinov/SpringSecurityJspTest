package com.lasersizer.repository;

import com.lasersizer.model.User;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}