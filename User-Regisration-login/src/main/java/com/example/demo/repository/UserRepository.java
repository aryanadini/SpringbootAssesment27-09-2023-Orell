package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	  User findByEmail(String email); 
		
		
	

	

}
