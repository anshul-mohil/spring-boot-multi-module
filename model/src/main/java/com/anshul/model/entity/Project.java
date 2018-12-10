package com.anshul.model.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "SYM_PB_PROJECTS")
@DynamicUpdate(value = true)
public class Project implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "PROJECT_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long projectId;

  @Column(name = "PROJECT_NAME")
  private String projectName;

  @Column(name = "DESCRIPTION")
  private String projectDescription;

  @Column(name = "INSTRUCTIONS")
  private String instuctions;

  @Column(name = "PROJECT_EMAIL")
  private String projectEmail;

  @Column(name = "DEPARTMENT_ID")
  private String departmentId;

  @Column(name = "DEPARTMENT_NAME")
  private String departmentName;

  @Column(name = "PRODUCT_NAME")
  private String productName;

  @Column(name = "PRODUCT_TYPE")
  private String productType;

  @Column(name = "PRODUCT_FAMILY")
  private String productFamilyId;

  @Column(name = "MANAGER")
  private String manager;

  @Column(name = "NUMBER_OF_MACHINES")
  private String numberOfMachines;

  @Column(name = "DUE_ON")
  private Date dueOn;

  @Column(name = "PRODUCT_VERSION")
  private String productVersion;

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
  private String isPublic;

  @CreationTimestamp
  @Column(name = "CREATION_DATE")
  private Date creationDate;

  @UpdateTimestamp
  @Column(name = "LAST_UPDATE_DATE")
  private Date lastUpdateDate;

  @Column(name = "CREATED_BY")
  private String createdBy;

  @Column(name = "LAST_UPDATED_BY")
  private String updatedBy;

  @Column(name = "LAST_UPDATE_LOGIN")
  private String lastUpdateLogin;

  @Column(name = "PROJECT_AGREEMENT")
  private String projAgreement;

  @Column(name = "project_status")
  private String projectStatus;

  @OneToMany(mappedBy = "projId", cascade = CascadeType.ALL)
  private List<Document> lDoc = new ArrayList<>();

  @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL)
  private List<Users> lUser = new ArrayList<>();

  @OneToMany(mappedBy = "projectId", cascade = CascadeType.ALL)
  private List<Tasks> lTask = new ArrayList<>();

  public Long getProjectId() {
    return projectId;
  }

  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }

  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public String getProjectDescription() {
    return projectDescription;
  }

  public void setProjectDescription(String projectDescription) {
    this.projectDescription = projectDescription;
  }

  public String getInstuctions() {
    return instuctions;
  }

  public void setInstuctions(String instuctions) {
    this.instuctions = instuctions;
  }

  public String getProjectEmail() {
    return projectEmail;
  }

  public void setProjectEmail(String projectEmail) {
    this.projectEmail = projectEmail;
  }

  public String getDepartmentId() {
    return departmentId;
  }

  public void setDepartmentId(String departmentId) {
    this.departmentId = departmentId;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  public String getProductFamilyId() {
    return productFamilyId;
  }

  public void setProductFamilyId(String productFamilyId) {
    this.productFamilyId = productFamilyId;
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

  public String getProductVersion() {
    return productVersion;
  }

  public void setProductVersion(String productVersion) {
    this.productVersion = productVersion;
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

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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

  public String getProjectStatus() {
    return projectStatus;
  }

  public void setProjectStatus(String projectStatus) {
    this.projectStatus = projectStatus;
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

  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public String getIsPublic() {
    return isPublic;
  }


}
