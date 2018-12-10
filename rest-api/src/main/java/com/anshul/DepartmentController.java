package com.anshul;

import com.anshul.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "departments", headers = "Accept=application/json")
public class DepartmentController {

  @Autowired
  DepartmentServiceImpl departmentService;

  @GetMapping
  public ResponseEntity<Object> getDepartments() {
    return departmentService.getDepartments();
  }
}
