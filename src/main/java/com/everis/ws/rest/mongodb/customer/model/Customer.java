package com.everis.ws.rest.mongodb.customer.model;


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

    private String name;
    private String lastname;
    private String motherLastname;
    private String idBankAccount;
    private String numberBankAccount;
    private double maxCreditLimit;
    
    
    
    
    public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public Customer(String name, String lastname, String motherLastname, String idBankAccount, String numberBankAccount,
			double maxCreditLimit) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.motherLastname = motherLastname;
		this.idBankAccount = idBankAccount;
		this.numberBankAccount = numberBankAccount;
		this.maxCreditLimit = maxCreditLimit;
	}
	
    
    
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getMotherLastname() {
		return motherLastname;
	}
	public void setMotherLastname(String motherLastname) {
		this.motherLastname = motherLastname;
	}
	public String getIdBankAccount() {
		return idBankAccount;
	}
	public void setIdBankAccount(String idBankAccount) {
		this.idBankAccount = idBankAccount;
	}
	public String getNumberBankAccount() {
		return numberBankAccount;
	}
	public void setNumberBankAccount(String numberBankAccount) {
		this.numberBankAccount = numberBankAccount;
	}
	public double getMaxCreditLimit() {
		return maxCreditLimit;
	}
	public void setMaxCreditLimit(double maxCreditLimit) {
		this.maxCreditLimit = maxCreditLimit;
	}
	
}
