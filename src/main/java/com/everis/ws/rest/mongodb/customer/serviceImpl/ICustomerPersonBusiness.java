package com.everis.ws.rest.mongodb.customer.serviceImpl;

import com.everis.ws.rest.mongodb.customer.model.Customer;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ICustomerPersonBusiness {
	 Mono<Customer> create(Customer personalCustomer);
	 Flux<Customer> findAll();
	 Mono<Customer> update(String id, Customer personalCustomer);
	 Mono<Customer> getById(String id);
	 Mono delete(String id); 
}
