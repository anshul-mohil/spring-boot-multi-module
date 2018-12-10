package com.anshul.model.models;

import com.anshul.model.entity.Projects;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties
public class ProjectSummaryOverview {

  @JsonProperty
  private Projects projects;
  @JsonProperty()
  private Integer userCount;
  @JsonProperty()
  private Integer actionCount;
  @JsonProperty()
  private Integer defectCount;
  @JsonProperty()
  private Integer forumCount;

  public Projects getProjects() {
    return projects;
  }

  public void setProjects(Projects projects) {
    this.projects = projects;
  }

  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }

  public Integer getActionCount() {
    return actionCount;
  }

  public void setActionCount(Integer actionCount) {
    this.actionCount = actionCount;
  }

  public Integer getDefectCount() {
    return defectCount;
  }

  public void setDefectCount(Integer defectCount) {
    this.defectCount = defectCount;
  }

  public Integer getForumCount() {
    return forumCount;
  }

  public void setForumCount(Integer forumCount) {
    this.forumCount = forumCount;
  }
}
