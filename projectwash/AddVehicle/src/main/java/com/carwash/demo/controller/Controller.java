package com.carwash.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carwash.demo.model.VehicleAdd;
import com.carwash.demo.repo.Repository;

@RestController
public class Controller {

	@Autowired
	Repository  repo;
	
	@PostMapping("/vehicleadd")
	void Addvehicle(@RequestBody VehicleAdd vehicle) {
		System.out.println(vehicle);
		repo.save(vehicle);
		
		
		
	}

	
}
