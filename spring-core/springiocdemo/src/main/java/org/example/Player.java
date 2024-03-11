package org.example;

import org.springframework.beans.factory.annotation.Qualifier;

public class Player {

    int playerId; // instance primitive varaible
    String playerName; // instance reference varaible
    String teamName; // instance reference varaible
    private Team team1; // instance reference varaible



    public Player(){
        System.out.println("no arg player constructor");
    }
                    //2000      Dhoni
    public Player(int playerId, String playerName) {
        System.out.println("player 2 arg constructor");
        this.playerId = playerId;
        this.playerName = playerName;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
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
        team1.createTeam();
    }
}

