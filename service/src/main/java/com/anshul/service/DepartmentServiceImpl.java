package com.anshul.service;

import com.anshul.repository.project.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  DepartmentRepository departmentRepository;

  @Override
  public ResponseEntity<Object> getDepartments() {

    return new ResponseEntity<>(departmentRepository.findAll(), HttpStatus.OK);
  }

}
