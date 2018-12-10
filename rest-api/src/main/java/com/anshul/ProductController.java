package com.anshul;

import com.anshul.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "products", headers = "Accept=application/json")
public class ProductController {

  @Autowired
  ProductService productService;

  @GetMapping
  public ResponseEntity<Object> getProducts() {
    return productService.getProducts();
  }

}
