package com.example.demo.dto;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data


public class UserDto {
	
private Long id;
	
	@NotEmpty
	
private String userName;
		
	@NotEmpty
private String address;
	
	@NotEmpty(message="Email should not be empty")
	@Email
private String email;
	
	@NotEmpty
	
private int phoneNumber;
	
	@NotEmpty
	
private int dob;
	
	@NotEmpty
	
private String gender;
	
	@NotEmpty
	
private Blob photo;
	
	@NotEmpty(message = "Password should not be empty")
private String password;
}
