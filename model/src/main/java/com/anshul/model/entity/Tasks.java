package com.anshul.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "TASKS")
public class Tasks implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "TASK_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long taskId;

  @Column(name = "NAME")
  private String name;

  @Column(name = "DESCRIPTION")
  private String description;

  @Column(name = "ATTACHMENTS")
  private Blob attachments;

  @Column(name = "ADD_SURVEYS")
  private String addSurveys;

  @Column(name = "DUE_DATE")
  private Date dueDate;

  @Column(name = "STATUS")
  private String status;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "PROJECT_ID")
  private Project projectId;

  @Column(name = "ACTIVE")
  private String active;

  @CreationTimestamp
  @Column(name = "CREATION_DATE")
  private Date creationDate;

  @UpdateTimestamp
  @Column(name = "LAST_UPDATE_DATE")
  private Date lastUpdateDate;

  @Column(name = "CREATED_BY")
  private String createdBy;

  @Column(name = "LAST_UPDATED_BY")
  private String lastUpdatedBy;

  @Column(name = "LAST_UPDATE_LOGIN")
  private String lastUpdateLogin;

  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Blob getAttachments() {
    return attachments;
  }

  public void setAttachments(Blob attachments) {
    this.attachments = attachments;
  }

  public String getAddSurveys() {
    return addSurveys;
  }

  public void setAddSurveys(String addSurveys) {
    this.addSurveys = addSurveys;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public void setDueDate(Date dueDate) {
    this.dueDate = dueDate;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Project getProjectId() {
    return projectId;
  }

  public void setProjectId(Project projectId) {
    this.projectId = projectId;
  }

  public String getActive() {
    return active;
  }

  public void setActive(String active) {
    this.active = active;
  }

  public Date getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(Date creationDate) {
    this.creationDate = creationDate;
  }

  public Date getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(Date lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public String getLastUpdateLogin() {
    return lastUpdateLogin;
  }

  public void setLastUpdateLogin(String lastUpdateLogin) {
    this.lastUpdateLogin = lastUpdateLogin;
  }


}
