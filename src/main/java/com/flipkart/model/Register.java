package com.flipkart.model;


import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Register {

  private String id;
  private String name;
  private String email;
  private String password;
  private boolean active;
  private String otp;
  private LocalDateTime otpGeneratedTime;
  private String token;
}
