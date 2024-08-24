package com.demo.BasicAuth.repository;

import com.demo.BasicAuth.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}
