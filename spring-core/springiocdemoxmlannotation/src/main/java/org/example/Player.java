package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {
    @Autowired
    private Team team;


    int playerId; // instance primitive varaible
    String playerName; // instance reference varaible
    String teamName; // instance reference varaible

    public void setTeam(Team team) {
        this.team = team;
    }

    public Player(){

    }
                    //2000      Dhoni
    public Player(int playerId, String playerName) {
        System.out.println("player 2 arg constructor");
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public Player(int playerId, String playerName, String teamName) {
        System.out.println("player 3 arg constructor");
        this.playerId = playerId;
        this.playerName = playerName;
        this.teamName = teamName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public void createPlayer(){
        System.out.println("create player method is called");
        team.createTeam();
    }
}

