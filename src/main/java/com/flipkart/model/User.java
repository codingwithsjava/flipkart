package com.flipkart.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.ResponseEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document(collection = "order_db")
public class User {
	
	@Id
	private String id;
	
	private String name;
	
	private String gender;
	
	private List<Product> products;
	
	private Address address;
	
	transient private  ResponseEntity<Register> tokens;
	
	transient private User user;


}
