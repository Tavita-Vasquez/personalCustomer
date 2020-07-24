package com.everis.ws.rest.mongodb.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.everis.ws.rest.mongodb.customer.model.Customer;
import com.everis.ws.rest.mongodb.customer.serviceImpl.customerServiceImpl;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("/rest/personalCustomer")
@RestController
public class customerController {
	
	@Autowired
	private customerServiceImpl registrationService;
	
	@PostMapping("/save")
	public Mono<Customer> save(@RequestBody final Customer personalCustomer) {
	System.out.println("Will register the personalCustomer :: "+ personalCustomer.toString());
	return registrationService.create(personalCustomer);
	}
	
	
	@GetMapping("/all")
	public Flux<Customer> getAll() {
	System.out.println("::GET_ALL Customer::");
	return registrationService.findAll();
	}
	
	
 	@PutMapping("/update/{id}")
	public Mono<Customer> updateById(@PathVariable("id") final Long id, @RequestBody final Customer personalCustomer) {
	System.out.println("::Update the Customer record::");
	return registrationService.update(id, personalCustomer);
	}
	
	
	
	@DeleteMapping("/delete/{id}")
	public Mono<Customer> delete(@PathVariable final Long id) {
	System.out.println("::Will delete a personalCustomer  ::");
	return registrationService.delete(id);
	}
	
	
	@GetMapping("/findById/{id}")
	public Mono<Customer> findById(@PathVariable final Long id) {
	System.out.println("::Will personalCustomer a personalCustomer  ::");
	return registrationService.getById(id);
	}
	
	
	
	
}
