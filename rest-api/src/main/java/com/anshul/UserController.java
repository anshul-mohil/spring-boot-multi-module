package com.anshul;

import com.anshul.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "users", headers = "Accept=application/json")
public class UserController {

  @Autowired
  UserServiceImpl userService;

  @GetMapping
  public ResponseEntity<Object> getUsers() {

    return userService.getUsers();
  }

}
