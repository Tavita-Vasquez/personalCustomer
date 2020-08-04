package com.everis.ws.rest.mongodb.customer.model;


import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Data  
@AllArgsConstructor  
@NoArgsConstructor  
@Getter
@Setter
@ToString
@Document( collection = "personalCustomer")
public class Customer {

    @Id
    private String id;

	@NotNull(message = "name cant be null")
    private String name;

	@NotNull(message = "lastname cant be null")
    private String lastname;

	@NotNull(message = "motherLastname cant be null")
    private String motherLastname;

	@NotNull(message = "idBankAccount cant be null")
    private String idBankAccount;

	@NotNull(message = "numberBankAccount cant be null")
    private String numberBankAccount;

	@NotNull(message = "maxCreditLimit cant be null")
    private double maxCreditLimit;
    
	@NotNull(message = "bank cant be null")
	private String bank;	
	
	@NotNull(message = "clienttype cant be null")
	private String clienttype;
	
	@NotNull(message = "clientcode cant be null")
	private String clientcode;  
   	
}
