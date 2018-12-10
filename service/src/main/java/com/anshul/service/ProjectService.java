package com.anshul.service;

import com.anshul.model.entity.Project;
import org.springframework.http.ResponseEntity;

import java.util.List;


public interface ProjectService {

  ResponseEntity<Object> getProjects();

  ResponseEntity<Object> getProjectById(Long id);

  ResponseEntity<Object> getProjectsByOwner(String Owner);

  ResponseEntity<Object> saveProject(Project sb);

  ResponseEntity<Object> saveAllProjects(List<Project> lsb);

  ResponseEntity<Object> getProjectSummary(Long projectId, String status);
}
