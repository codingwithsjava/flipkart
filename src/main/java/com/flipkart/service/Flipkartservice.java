//package com.flipkart.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import com.flipkart.model.Register;
//import com.flipkart.model.User;
//import com.flipkart.repository.Flipkartrepo;
//import com.flipkart.response.ApIResponse;
//
//@Service
//public class Flipkartservice {
//		@Autowired
//		private Flipkartrepo userRepository;
//		
////		@Autowired
////		private ForgotService forgotService;
//		
//	
////		public User1 get(String token) {
////
////        User1 user = flipkartrepo.findBytoken(token).orElseThrow(() -> new RuntimeException("token not found"));
////        user.setTokens(forgotService.getTokenOfToken(user.getId()));
////        return user;
////    }
//		ApIResponse apiResponse=new ApIResponse();
//
//		public ApIResponse<User> get(String id) {
//			User user=userRepository.findById(id).orElseThrow(()->new RuntimeException("token not found!"));
//			user.setTokens( forgotService.getById(user.getId()));
//		    apiResponse =new ApIResponse(true,200, user, null);
//
//		//	ResponseEntity token1=forgotService.getById(id);
//			return apiResponse;
//			
//		}
//}
