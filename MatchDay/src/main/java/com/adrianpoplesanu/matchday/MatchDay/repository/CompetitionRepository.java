package com.adrianpoplesanu.matchday.MatchDay.repository;

import com.adrianpoplesanu.matchday.MatchDay.model.Competition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long> {
}
