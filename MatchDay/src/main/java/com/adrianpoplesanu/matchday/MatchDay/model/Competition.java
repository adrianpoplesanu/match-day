package com.adrianpoplesanu.matchday.MatchDay.model;

import javax.persistence.*;

@Entity
@Table(name = "competitions")
public class Competition {
    @Id
    @Column(name = "competitionid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String footballDataCode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFootballDataCode() {
        return footballDataCode;
    }

    public void setFootballDataCode(String footballDataCode) {
        this.footballDataCode = footballDataCode;
    }
}
