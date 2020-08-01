package com.everis.ws.rest.mongodb.customer.model;

import java.util.Date;

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
@Document()
public class CustomerEvent {

	private Customer customer;
	private Date date;
	
	
		
}
