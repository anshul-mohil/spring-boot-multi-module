package com.anshul.repository.project;


import com.anshul.model.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

  @Query("select p from Project p where p.createdBy=:owner")
  List<Project> getProjectsByOwner(@Param("owner") String owner);

  @Query("select q from Project q where q.createdBy =:owner and q.isPublic='Y'")
  List<Project> getProjectsByOthersPublic(@Param("owner") String owner);

  @Query("select r from Project r where r.projectId in (select s.projectId from Users s where s.userFullName=:owner)")
  List<Project> getProjectsByTester(@Param("owner") String owner);

}
