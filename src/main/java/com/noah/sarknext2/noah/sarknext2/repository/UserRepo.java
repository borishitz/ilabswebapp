package com.noah.sarknext2.noah.sarknext2.repository;

import com.noah.sarknext2.noah.sarknext2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
