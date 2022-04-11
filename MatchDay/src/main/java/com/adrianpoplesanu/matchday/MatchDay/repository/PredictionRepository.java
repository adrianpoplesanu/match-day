package com.adrianpoplesanu.matchday.MatchDay.repository;

import com.adrianpoplesanu.matchday.MatchDay.model.Prediction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PredictionRepository extends JpaRepository<Prediction, Long> {
}
