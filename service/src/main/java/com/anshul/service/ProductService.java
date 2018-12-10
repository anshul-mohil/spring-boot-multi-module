package com.anshul.service;

import org.springframework.http.ResponseEntity;

public interface ProductService {

  ResponseEntity<Object> getProducts();

}
