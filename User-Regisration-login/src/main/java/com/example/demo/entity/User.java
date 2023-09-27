package com.example.demo.entity;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity

@Data

@Table(name="users")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
	
	@Column(nullable=false)
	
private String userName;
	
	
	
	@Column(nullable=false)
	
private String address;
	
	@Column(nullable=false)
	
private String email;
	
	@Column(nullable=false, unique=true)
	
private int phoneNumber;
	
	@Column(nullable=false)
	
private int dob;
	
	@Column(nullable=false)
	
private String gender;
	
	@Column(nullable=false)
	
private Blob photo;
	
	@Column(nullable=false)
	
private String password;
	
	@ManyToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name="users_roles",
			joinColumns = {@JoinColumn(name="USER_ID", referencedColumnName = "ID")},
			inverseJoinColumns = {@JoinColumn(name="ROLE_ID", referencedColumnName = "ID")})
	private List<Role>roles=new ArrayList<>();
	
}
