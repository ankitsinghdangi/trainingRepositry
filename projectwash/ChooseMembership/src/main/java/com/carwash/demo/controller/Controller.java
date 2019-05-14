package com.carwash.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.model.Membership;
import com.carwash.demo.repo.Repository;

@RestController
public class Controller 
{
	@Autowired
	private Repository repo;
	
	@PostMapping("/membership")
	void bookWash(@RequestBody Membership mem ) {
		System.err.println(mem);
      
		repo.save(mem);
	}
}
