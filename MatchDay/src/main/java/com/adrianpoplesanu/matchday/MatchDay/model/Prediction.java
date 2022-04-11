package com.adrianpoplesanu.matchday.MatchDay.model;

import javax.persistence.*;

@Entity
@Table(name = "predictions")
public class Prediction {
    @Id
    @Column(name = "predictionid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "userid")
    private long userId;

    @Column(name = "matchid")
    private long matchId;

    @Column(name = "competitionid")
    private long competitionId;

    @Column(name = "score1")
    private int score1;

    @Column(name = "score2")
    private int score2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getMatchId() {
        return matchId;
    }

    public void setMatchId(long matchId) {
        this.matchId = matchId;
    }

    public long getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(long competitionId) {
        this.competitionId = competitionId;
    }

    public int getScore1() {
        return score1;
    }

    public void setScore1(int score1) {
        this.score1 = score1;
    }

    public int getScore2() {
        return score2;
    }

    public void setScore2(int score2) {
        this.score2 = score2;
    }
}
