package com.everis.ws.rest.mongodb.customer.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.everis.ws.rest.mongodb.customer.model.Customer;

@Repository
public interface customerRepostiroy extends ReactiveMongoRepository<Customer, Long>  {

}
