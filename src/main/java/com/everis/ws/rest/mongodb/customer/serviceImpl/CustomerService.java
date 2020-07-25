package com.everis.ws.rest.mongodb.customer.serviceImpl;

import org.springframework.stereotype.Service;

import com.everis.ws.rest.mongodb.customer.model.Customer;
import com.everis.ws.rest.mongodb.customer.model.CustomerEvent;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface CustomerService {
	 Mono<Customer> create(Customer personalCustomer);
	 Flux<Customer> findAll();
	 Mono<Customer> update(String id, Customer personalCustomer);
	 Mono<Customer> getById(String id);
	 Mono delete(String id);
	 
}
