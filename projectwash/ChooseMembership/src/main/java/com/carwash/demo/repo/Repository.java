package com.carwash.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.carwash.demo.model.Membership;


public interface Repository extends MongoRepository<Membership,String>
{

}