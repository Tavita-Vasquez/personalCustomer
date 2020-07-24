package com.everis.ws.rest.mongodb.customer.serviceImpl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.everis.ws.rest.mongodb.customer.model.Customer;
import com.everis.ws.rest.mongodb.customer.repository.customerRepostiroy;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class customerServiceImpl implements CustomerService {

	@Autowired
	private customerRepostiroy repository;

	 @Autowired
	 MessageSource i18n;
	 
	@Override
	public Mono<Customer> create(Customer customerpersonal) {
		return repository.save(customerpersonal);
	}

	@Override
	public Flux<Customer> findAll() {
		 return repository.findAll();
	}

	@Override
	public Mono<Customer> update(String id, Customer customerpersonal) {
		// TODO Auto-generated method stub
		return  repository.save(customerpersonal);
	}

	
	@Override
	public Mono delete(String id) {
		// TODO Auto-generated method stub
		Mono delete=null;
		 final Mono<Customer> dbcustomerPersonal = getById(id);
		  if (Objects.isNull(dbcustomerPersonal)) {
		   return Mono.empty();
		  }
		  delete =  getById(id).switchIfEmpty(Mono.empty()).filter(Objects::nonNull).flatMap(customerPersonaltoBeDeleted -> repository
		    .delete(customerPersonaltoBeDeleted).then(Mono.just(customerPersonaltoBeDeleted)));
		 
		  return delete;
	}
	
	public Mono<Customer> getById(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Mono<Customer> getById(String id) {
		// TODO Auto-generated method stub
		return null;//repository.findById(id);
	}
	 
	
}
  