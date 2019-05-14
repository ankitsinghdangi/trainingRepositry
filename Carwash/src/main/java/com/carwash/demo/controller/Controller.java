package com.carwash.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.model.Register;
import com.carwash.demo.repo.Repository;

@RestController
public class Controller {
	 
private	Repository repo; 
	
	
	@PostMapping("/add")
	 void addUser(@RequestBody Register reg) {
		repo.save(reg);
		
	}
	
	@GetMapping("/getallUser")
	public
	List<Register> getAllUser(){
		return repo.findAll();
	}
	
	/*
	 * @PostMapping("/valid") boolean validateUser(@RequestBody Register reg) {
	 * System.out.println(reg); List<Register> regis=repo.findAll(); for(Register
	 * reg1:regis) {
	 * if(reg1.getEmail().equals(reg.getEmail())&&reg1.getPassword().equals(reg.
	 * getPassword())) { return true; }
	 * 
	 * 
	 * } return false; }
	 */

}
