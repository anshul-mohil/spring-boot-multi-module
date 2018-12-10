package com.anshul.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "PROJECTS")
@DynamicUpdate(value = true)
@JsonIgnoreProperties
public class Projects implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "PROJECT_ID")
  //@JsonProperty("project-id")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long projectId;

  //  @JsonProperty("project-name")
  @Column(name = "PROJECT_NAME")
  private String projectName;

  //  @JsonProperty("description")
  @Column(name = "DESCRIPTION")
  private String desciption;

  @Column(name = "INSTRUCTIONS")
  private String instuctions;

  //  @JsonProperty("department-name")
  @Column(name = "DEPARTMENT_NAME")
  private String deptName;

  //  @JsonProperty("product-name")
  @Column(name = "PRODUCT_NAME")
  private String prodName;

  @Column(name = "PRODUCT_TYPE")
  private String prodType;

  @Column(name = "MANAGER")
  private String manager;

  @Column(name = "NUMBER_OF_MACHINES")
  private String numberOfMachines;

  @Column(name = "DUE_ON")
  private Date dueOn;

  @Column(name = "PRODUCT_VERSION")
  private String prodVersion;

  @Column(name = "START_DATE")
  private Date startDate;

  @Column(name = "END_DATE")
  private Date endDate;

  @Column(name = "GOAL")
  private String goal;

  @Column(name = "RELEASE_NOTES")
  private String releaseNotes;

  @Column(name = "PROJECT_TYPE")
  private String projectType;

  @Column(name = "PUBLIC_OR_NOT")
  private String publicOrNot;

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
  @Column(name = "PROJECT_AGREEMENT")
  private String projAgreement;
  @Column(name = "PROJECT_STATUS")
  private String projectStatus;
  @Column(name = "AGREEMENT_STATUS")
  private String agreementStatus;
  @OneToMany(mappedBy = "projId", cascade = CascadeType.ALL)
  private List<Document> lDoc = new ArrayList<>();
  @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL)
  private List<Users> lUser = new ArrayList<>();
  @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL)
  private List<Tasks> lTask = new ArrayList<>();

  public String getProjectStatus() {
    return projectStatus;
  }

  public void setProjectStatus(String projectStatus) {
    this.projectStatus = projectStatus;
  }

  public String getAgreementStatus() {
    return agreementStatus;
  }

  public void setAgreementStatus(String agreementStatus) {
    this.agreementStatus = agreementStatus;
  }

  public List<Document> getlDoc() {
    return lDoc;
  }

  public void setlDoc(List<Document> lDoc) {
    this.lDoc = lDoc;
  }

  public List<Users> getlUser() {
    return lUser;
  }

  public void setlUser(List<Users> lUser) {
    this.lUser = lUser;
  }

  public List<Tasks> getlTask() {
    return lTask;
  }

  public void setlTask(List<Tasks> lTask) {
    this.lTask = lTask;
  }

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  @Column(name = "PROJECT_NAME")
  public String getProjectName() {
    return projectName;
  }

  @Column(name = "PROJECT_NAME")
  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getDesciption() {
    return desciption;
  }

  public void setDesciption(String desciption) {
    this.desciption = desciption;
  }

  public String getInstuctions() {
    return instuctions;
  }

  public void setInstuctions(String instuctions) {
    this.instuctions = instuctions;
  }

  public String getDeptName() {
    return deptName;
  }

  public void setDeptName(String deptName) {
    this.deptName = deptName;
  }

  public String getProdName() {
    return prodName;
  }

  public void setProdName(String prodName) {
    this.prodName = prodName;
  }

  public String getProdType() {
    return prodType;
  }

  public void setProdType(String prodType) {
    this.prodType = prodType;
  }

  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public String getNumberOfMachines() {
    return numberOfMachines;
  }

  public void setNumberOfMachines(String numberOfMachines) {
    this.numberOfMachines = numberOfMachines;
  }

  public Date getDueOn() {
    return dueOn;
  }

  public void setDueOn(Date dueOn) {
    this.dueOn = dueOn;
  }

  public String getProdVersion() {
    return prodVersion;
  }

  public void setProdVersion(String prodVersion) {
    this.prodVersion = prodVersion;
  }

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public String getGoal() {
    return goal;
  }

  public void setGoal(String goal) {
    this.goal = goal;
  }

  public String getReleaseNotes() {
    return releaseNotes;
  }

  public void setReleaseNotes(String releaseNotes) {
    this.releaseNotes = releaseNotes;
  }

  public String getProjectType() {
    return projectType;
  }

  public void setProjectType(String projectType) {
    this.projectType = projectType;
  }

  public String getPublicOrNot() {
    return publicOrNot;
  }

  public void setPublicOrNot(String publicOrNot) {
    this.publicOrNot = publicOrNot;
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

  public String getProjAgreement() {
    return projAgreement;
  }

  public void setProjAgreement(String projAgreement) {
    this.projAgreement = projAgreement;
  }

}
