package com.anshul.repository.project;


import com.anshul.model.entity.Projects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("SummaryRepository")
public interface SummaryRepository extends JpaRepository<Projects, Long> {

  @Query(value = "SELECT ( SELECT COUNT(*) FROM SYM_PB_USERS WHERE PROJECT_ID = ?1) AS USER_COUNT, " +
      "( SELECT COUNT(*) FROM SYM_PB_ACTION_ITEMS WHERE PROJECT_ID = ?1 AND STATUS = ?2) AS ACTION_COUNT, " +
      "( SELECT COUNT(*) FROM SYM_PB_DEFECTS WHERE PROJECT_ID = ?1) AS DEFECT_COUNT, " +
      "( SELECT COUNT(*) FROM SYM_PB_FORUMS WHERE PROJECT_ID = ?1) AS FORUM_COUNT FROM DUAL", nativeQuery = true)
  String getProje̱ctSummaryOverview(String projectId, String status);

  @Query(value = "SELECT * FROM SYM_PB_PROJECTS WHERE PROJECT_ID = ?1", nativeQuery = true)
  Projects getProjectDetails(Long projectId);

}









