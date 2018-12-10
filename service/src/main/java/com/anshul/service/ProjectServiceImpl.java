package com.anshul.service;

import com.anshul.model.entity.Project;
import com.anshul.model.entity.Projects;
import com.anshul.model.models.ProjectSummaryOverview;
import com.anshul.repository.project.ProjectRepository;
import com.anshul.repository.project.SummaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {


  @Autowired
  private ProjectRepository projectRepository;

  @Autowired
  private SummaryRepository summaryRepository;

  @Override
  public ResponseEntity<Object> getProjects() {
    return new ResponseEntity<>(projectRepository.findAll(), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Object> getProjectById(Long id) {
    return new ResponseEntity<>(projectRepository.findById(id), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Object> saveProject(Project sb) {
    sb.getlDoc().forEach(m -> m.setProjId(sb));
    sb.getlUser().forEach(m -> m.setProjectId(sb));
    sb.getlTask().forEach(m -> m.setProjectId(sb));
    return new ResponseEntity<>(projectRepository.save(sb), HttpStatus.OK);
  }

  //todo: remove this method from interface and use as helper method
  @Override
  public ResponseEntity<Object> saveAllProjects(List<Project> lsb) {
    //TODO: for loop to call saveProject for entire list
    return new ResponseEntity<>(projectRepository.saveAll(lsb), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Object> getProjectsByOwner(String owner) {
    List<Project> lOwner = new ArrayList<>();
    lOwner.addAll(projectRepository.getProjectsByOwner(owner));
    lOwner.addAll(projectRepository.getProjectsByOthersPublic(owner));
    lOwner.addAll(projectRepository.getProjectsByTester(owner));
    return new ResponseEntity<>(lOwner, HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Object> getProjectSummary(Long projectId, String status) {

    return getObjectProjectSummaryResponseObject(projectId, status, summaryRepository);
  }

  private ResponseEntity<Object> getObjectProjectSummaryResponseObject(Long projectId, String status, SummaryRepository summaryRepository) {
    if (status == null || status == "") {
      status = "ACTIVE";
    }

    status = status.toUpperCase();

    Projects projectSummary = summaryRepository.getProjectDetails(projectId);
    String countString = summaryRepository.getProje̱ctSummaryOverview(projectId.toString(), status);
    String[] counts = countString.split(",");

    ProjectSummaryOverview projectSummaryOverview = new ProjectSummaryOverview();

    projectSummaryOverview.setUserCount(Integer.valueOf(counts[0]));
    projectSummaryOverview.setActionCount(Integer.valueOf(counts[1]));
    projectSummaryOverview.setDefectCount(Integer.valueOf(counts[2]));
    projectSummaryOverview.setForumCount(Integer.valueOf(counts[3]));

    projectSummaryOverview.setProjects(projectSummary);
    return new ResponseEntity<>(projectSummaryOverview, HttpStatus.OK);
  }

}
