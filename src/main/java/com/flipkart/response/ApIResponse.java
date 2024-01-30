package com.flipkart.response;

import com.flipkart.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApIResponse<T> {

	public ApIResponse() {
		// TODO Auto-generated constructor stub
	}
	private Boolean status;
	private Integer success;
	private Object data;
	private Object error;

}
