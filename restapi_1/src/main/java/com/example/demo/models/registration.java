package com.example.demo.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class registration {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
//	creating column names for table
//	and must be in small
	private int id;

	private String name;
	
	private String email;

	private String password;
}
