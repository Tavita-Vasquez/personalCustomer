package com.everis.ws.rest.mongodb.customer.model;

import java.util.List;

import org.springframework.data.annotation.Id;


public class CustomerVIP {
	    @Id
	    private String id;

	    private String name;
	    private String lastname;
	    private String motherLastname;
	    private String typeproduct;
	    private String numberBankAccount;
	    private double maxCreditLimit;
	
	
	
}
 