package com.carwash.demo.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.model.Bookwashservice;
import com.carwash.demo.repo.Repository;

@RestController
public class Controller 
{
	@Autowired
	private Repository repo;
	
	@PostMapping("/bookWash")
	public List<Bookwashservice> bookWash(@RequestBody Bookwashservice vehicle ) {
		System.err.println(vehicle);
      
		List<Bookwashservice> ll= (List<Bookwashservice>) repo.save(vehicle);
		return ll;
	}
}
