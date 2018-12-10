package com.anshul.model.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "FEEDBACK")
public class Feedback implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "TITLE_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long titleId;

  @Column(name = "TITLE")
  private String title;

  @Column(name = "TYPE")
  private String type;

  @Column(name = "STATUS")
  private String status;

  @Column(name = "PROJECT_ID")
  private Long projId;

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

  public Long getTitleId() {
    return titleId;
  }

  public void setTitleId(Long titleId) {
    this.titleId = titleId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getProjId() {
    return projId;
  }

  public void setProjId(Long projId) {
    this.projId = projId;
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
