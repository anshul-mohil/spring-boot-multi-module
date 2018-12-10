package com.anshul;

import com.anshul.model.entity.Project;
import com.anshul.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "projects", headers = "Accept=application/json")
public class ProjectController {

  @Autowired
  ProjectService projectService;

  @GetMapping
  public ResponseEntity<Object> getProjects() {
    return projectService.getProjects();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Object> getProjectById(@PathVariable Long id) {
    return projectService.getProjectById(id);
  }

  //TODO: Need to expose single API for single as well as multiple project detail save
  @PutMapping
  public ResponseEntity<Object> saveProject(@RequestBody Project sb) {
    return projectService.saveProject(sb);
  }

  //TODO: Need to expose single API for single as well as multiple project detail save
  @PutMapping("/all")
  public ResponseEntity<Object> saveAllProjects(@RequestBody List<Project> lsb) {
    return projectService.saveAllProjects(lsb);
  }

  @GetMapping("/{owner}")
  public ResponseEntity<Object> getProjectsByOwner(@PathVariable String owner) {
    return projectService.getProjectsByOwner(owner);
  }

  @GetMapping(value = "/project-summary/{projectId}")
  public ResponseEntity getProjectSummary(@PathVariable("projectId") Long projectId, @RequestParam(value = "status", required = false) String status) {
    return projectService.getProjectSummary(projectId, status);
  }

}
