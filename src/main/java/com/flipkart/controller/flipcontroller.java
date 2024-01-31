package com.flipkart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.model.User;
import com.flipkart.repository.Flipkartrepo;
import com.flipkart.response.ApIResponse;

@RestController
@RequestMapping("/order-service")
public class flipcontroller {
	@Autowired
	private Flipkartrepo repository;
	
	
//	@Autowired
//	private Flipkartservice flipkartservice;
  @GetMapping("/get")
  public ApIResponse<String> getprint() {
	  ApIResponse apIResponse=new ApIResponse(true, 200, "this is spring boot project", null);

	  return apIResponse ;
  }
@PostMapping("/placeorderNow")
public ApIResponse placeorder(@RequestBody User user) {

	repository.save(user);
ApIResponse apIResponse=new ApIResponse(true, 200, user, null);
	
	return  apIResponse;
}

@GetMapping("/getUserByUserName/{name}")
public ResponseEntity<ApIResponse<List<User>>> getUserByUserName(@PathVariable String name){
    List<User> user = repository.findByName(name);
    ApIResponse<List<User>> response = new ApIResponse<>();

    if (!user	.isEmpty()) {
        response.setStatus(true);
        response.setSuccess(200);
        response.setData(user);
        return ResponseEntity.ok(response);
    } else {
        response.setStatus(false);
        response.setData("No users found for name: " + name);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }

}

@GetMapping("/getUserByAddress/{city}")
public ResponseEntity<ApIResponse< List<User>>>getUserByAddress(@PathVariable String city){
    List<User> user = repository.findByCity(city);
    ApIResponse<List<User>> response = new ApIResponse<>();

	if(!user.isEmpty()) {
		response.setStatus(true);
		response.setSuccess(200);
		response.setData(user);
		return ResponseEntity.ok(response);
	}else {
		response.setStatus(false);
		response.setSuccess(409);
		response.setData("city not found");
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

}
//@GetMapping("/{id}")
//public ResponseEntity<ApIResponse<User>> getOne(@PathVariable String id) {
//	//ApIResponse apIResponse=new ApIResponse(true, 200, user, null);
//
//return  ResponseEntity.ok(flipkartservice.get(id));	
//    
//}
}
