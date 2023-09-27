package com.example.demo.repository;

import javax.management.relation.Role;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface RoleRepository extends JpaRepository<Role, Long>{
	com.example.demo.entity.Role findByName(String name);

	com.example.demo.entity.Role save(com.example.demo.entity.Role role);

	

}
