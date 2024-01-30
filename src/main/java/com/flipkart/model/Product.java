package com.flipkart.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
	
	private String name;
	
	private String  quantity;
	
	private String price;

}
