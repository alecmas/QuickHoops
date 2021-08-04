package com.alecmas.quickhoopsapi.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Player implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private Double pointsPerGame;
    private Double reboundsPerGame;
    private Double assistsPerGame;
    private String teamName;
    private String playerImageUrl;

    public Player() {
    }

    public Player(String firstName, String lastName, Double pointsPerGame, Double reboundsPerGame, Double assistsPerGame, String playerImageUrl) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pointsPerGame = pointsPerGame;
        this.reboundsPerGame = reboundsPerGame;
        this.assistsPerGame = assistsPerGame;
        this.playerImageUrl = playerImageUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getPointsPerGame() {
        return pointsPerGame;
    }

    public void setPointsPerGame(Double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public Double getReboundsPerGame() {
        return reboundsPerGame;
    }

    public void setReboundsPerGame(Double reboundPerGame) {
        this.reboundsPerGame = reboundPerGame;
    }

    public Double getAssistsPerGame() {
        return assistsPerGame;
    }

    public void setAssistsPerGame(Double assistsPerGame) {
        this.assistsPerGame = assistsPerGame;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getPlayerImageUrl() {
        return playerImageUrl;
    }

    public void setPlayerImageUrl(String playerImageUrl) {
        this.playerImageUrl = playerImageUrl;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pointsPerGame=" + pointsPerGame +
                ", reboundsPerGame=" + reboundsPerGame +
                ", assistsPerGame=" + assistsPerGame +
                ", teamName=" + teamName + + '\'' +
                ", playerImageUrl='" + playerImageUrl + '\'' +
                '}';
    }
}
