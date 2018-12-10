package com.anshul.service;


import com.anshul.repository.user.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


  @Autowired
  private UsersRepository usersRepository;

  @Override
  public ResponseEntity<Object> getUsers() {
    return new ResponseEntity<>(usersRepository.findAll(), HttpStatus.OK);
  }

}
