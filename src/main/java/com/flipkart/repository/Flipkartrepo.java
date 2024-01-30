package com.flipkart.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.flipkart.model.User;

public interface Flipkartrepo extends MongoRepository<User, String> {

	List<User> findByName(String name);
	
	//  Optional<User1> findBytoken(String token);


	@Query("{'Address.city':?0}")
	List<User> findByCity(String city);

}
