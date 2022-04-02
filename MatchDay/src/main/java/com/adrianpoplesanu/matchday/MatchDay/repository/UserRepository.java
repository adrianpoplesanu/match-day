package com.adrianpoplesanu.matchday.MatchDay.repository;

import com.adrianpoplesanu.matchday.MatchDay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User getUserByUsername(String username);
}
