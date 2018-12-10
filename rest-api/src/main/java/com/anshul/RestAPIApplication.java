package com.anshul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.anshul")
@RestController
public class RestAPIApplication {
  public static void main(String[] args) {
    SpringApplication.run(RestAPIApplication.class, args);
  }
}
