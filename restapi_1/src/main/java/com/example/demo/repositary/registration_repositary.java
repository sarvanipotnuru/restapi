package com.example.demo.repositary;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.registration;

public interface registration_repositary extends CrudRepository<registration, Integer>{

	registration findByEmail(String email);

	

}
