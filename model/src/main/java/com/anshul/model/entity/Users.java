package com.anshul.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Blob;
import java.util.Date;

@Entity
@Table(name = "USERS")
public class Users implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "USER_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long userId;

  @Column(name = "USER_FULL_NAME")
  private String userFullName;

  @Column(name = "FIRST_NAME")
  private String firstName;

  @Column(name = "LAST_NAME")
  private String lastName;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "ROLE")
  private String role;

  @Column(name = "EMAIL_ID")
  private String emailId;

  @Column(name = "SURVEY")
  private Long survey;

  @Column(name = "TASK")
  private Long task;

  @Column(name = "PROGRESS_PERCENTAGE")
  private Long progPercentage;

  @Column(name = "DEFECTS")
  private Long defects;

  @Column(name = "DEPARTMENT_ID")
  private Long deptId;

  @Column(name = "USER_PHOTOGRAPH")
  private Blob userPhotograph;

  @Column(name = "TASK_ID")
  private Long taskId;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "PROJECT_ID")
  private Project projectId;

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

  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public String getUserFullName() {
    return userFullName;
  }

  public void setUserFullName(String userFullName) {
    this.userFullName = userFullName;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public Long getSurvey() {
    return survey;
  }

  public void setSurvey(Long survey) {
    this.survey = survey;
  }

  public Long getTask() {
    return task;
  }

  public void setTask(Long task) {
    this.task = task;
  }

  public Long getProgPercentage() {
    return progPercentage;
  }

  public void setProgPercentage(Long progPercentage) {
    this.progPercentage = progPercentage;
  }

  public Long getDefects() {
    return defects;
  }

  public void setDefects(Long defects) {
    this.defects = defects;
  }

  public Long getDeptId() {
    return deptId;
  }

  public void setDeptId(Long deptId) {
    this.deptId = deptId;
  }

  public Blob getUserPhotograph() {
    return userPhotograph;
  }

  public void setUserPhotograph(Blob userPhotograph) {
    this.userPhotograph = userPhotograph;
  }

  public Long getTaskId() {
    return taskId;
  }

  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }

  public Project getProjectId() {
    return projectId;
  }

  public void setProjectId(Project projectId) {
    this.projectId = projectId;
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
