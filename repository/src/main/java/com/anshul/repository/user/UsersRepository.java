package com.anshul.repository.user;

import com.anshul.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("UsersRepository")
public interface UsersRepository extends JpaRepository<Users, Long> {
}
