package com.example.demo.services;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.registration;
import com.example.demo.repositary.registration_repositary;
@Service
public class registration_services1 {
	@Autowired 
	registration_repositary repo;
	public registration adding (registration regi) {
		return repo.save(regi);
	}
	public Iterable<registration> muli (List<registration> regi) {
		return repo.saveAll(regi);
		
	}
	public List<registration> fetch() {
		return (List<registration>) repo.findAll();
	
	}
	
	public Optional<registration> fetc(int id) {
		return repo.findById(id);
	}
	public String del(int id) {
		 repo.deleteById(id);
		return "Successfully deleted"+id;
	}
	public registration find(String email) {
		return repo.findByEmail(email);
	}
	
	
	
		

public registration update(registration reg) {
	int id =reg.getId();
	registration regi = repo.findById(id).get();
	regi.setEmail(reg.getEmail());
	regi.setPassword(reg.getPassword());
	regi.setName(reg.getName());
	return repo.save(regi);	
 }

}


