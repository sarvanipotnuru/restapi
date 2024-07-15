package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.registration;
import com.example.demo.services.registration_services1;
@RestController
@RequestMapping("/app/v1")
@CrossOrigin("http://localhost:4200")
public class registration_controllers {
	@Autowired
	registration_services1 service;
	@PostMapping("/add")
	public registration adding(@RequestBody registration reg) {
		return service.adding(reg);
	}
	@PostMapping("/multi")
	public Iterable<registration> muli(@RequestBody List<registration> reg) {
		return service.muli(reg);
	}
	@GetMapping("/fetch")
	public List<registration> fetch (){
		return service.fetch();
	}
	@GetMapping("/fetchbyid/{id}")
	public Optional<registration> fetchbyid(@PathVariable int id) {
		return service.fetc(id);
	}
	
	
	@DeleteMapping("/del/{id}")
	public String del(@PathVariable int id)  {
		return service.del(id);
		
	}
	@GetMapping("/findbyemail/{email}")
	public registration find(@PathVariable String email) {
		return service.find(email);
	}
     
	@PutMapping("/update")
	public registration update(@RequestBody registration regi) {
		return service.update(regi);
	}
    	 
     }

