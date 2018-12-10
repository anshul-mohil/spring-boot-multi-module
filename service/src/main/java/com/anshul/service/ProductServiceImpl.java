package com.anshul.service;

import com.anshul.repository.product.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService {

  @Autowired
  private ProductRepository productRepository;

  @Override
  public ResponseEntity<Object> getProducts() {

    return new ResponseEntity<>(productRepository.findAll(), HttpStatus.OK);
  }


}
