package com.everis.ws.rest.mongodb.customer.serviceImpl;

import com.everis.ws.rest.mongodb.customer.model.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
	 Mono<Customer> create(Customer personalCustomer);
	 Flux<Customer> findAll();
	 Mono<Customer> update(Long id, Customer personalCustomer);
	 Mono<Customer> getById(Long id);
	 Mono delete(Long id);
	
}
