package com.anshul.service;

import org.springframework.http.ResponseEntity;

public interface UserService {

  ResponseEntity<Object> getUsers();

}
