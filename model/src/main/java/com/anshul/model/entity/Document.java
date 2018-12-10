package com.anshul.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "DOCUMENT")
public class Document implements Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "DOCUMENT_ID")
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long docID;

  @Column(name = "NAME")
  private String name;

  @Column(name = "INSTRUCTIONS_TITLE")
  private String instructionsTitle;

  @Column(name = "INSTRUCTIONS_DESC")
  private String instuctionsDesc;

  @Column(name = "ATTACH_DOCUMENT")
  private String attachDoc;

  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "PROJECT_ID")
  private Project projId;

  @CreationTimestamp
  @Column(name = "CREATION_DATE")
  private Date creationDate;

  @UpdateTimestamp
  @Column(name = "LAST_UPDATE_DATE")
  private Date lastUpdateDate;

  @Column(name = "CREATED_BY")
  private String createdBy;

  @Column(name = "LAST_UPDATED_BY")
  private Date lastUpdatedBy;

  @Column(name = "LAST_UPDATE_LOGIN")
  private Date lastUpdateLogin;

  public Long getDocID() {
    return docID;
  }

  public void setDocID(Long docID) {
    this.docID = docID;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getInstructionsTitle() {
    return instructionsTitle;
  }

  public void setInstructionsTitle(String instructionsTitle) {
    this.instructionsTitle = instructionsTitle;
  }

  public String getInstuctionsDesc() {
    return instuctionsDesc;
  }

  public void setInstuctionsDesc(String instuctionsDesc) {
    this.instuctionsDesc = instuctionsDesc;
  }

  public String getAttachDoc() {
    return attachDoc;
  }

  public void setAttachDoc(String attachDoc) {
    this.attachDoc = attachDoc;
  }

  public Project getProjId() {
    return projId;
  }

  public void setProjId(Project projId) {
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

  public Date getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Date lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public Date getLastUpdateLogin() {
    return lastUpdateLogin;
  }

  public void setLastUpdateLogin(Date lastUpdateLogin) {
    this.lastUpdateLogin = lastUpdateLogin;
  }


}
