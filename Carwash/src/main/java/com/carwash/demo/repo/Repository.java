package com.carwash.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.model.Register;

public interface Repository extends MongoRepository<Register,String> {

}
