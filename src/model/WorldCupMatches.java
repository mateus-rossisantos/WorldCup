package model;

import jakarta.persistence.*;

@Entity
public class WorldCupMatches {
    @Id
    private int matchId;
    @OneToOne(cascade= CascadeType.ALL)
    @Embedded
    private WorldCups yearCup;
    private String dateTime;
    private String stage;
    private String stadium;
    private String city;
    private String homeTeamName;
    private String homeTeamGoals;
    private String awayTeamName;
    private String awayTeamGoals;
    private String winConditions;
    private String referee;
    private String homeTeamInitials;
    private String awayTeamInitials;



    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public WorldCups getYearCup() {
        return yearCup;
    }

    public void setYearCup(WorldCups yearCup) {
        this.yearCup = yearCup;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamGoals() {
        return homeTeamGoals;
    }

    public void setHomeTeamGoals(String homeTeamGoals) {
        this.homeTeamGoals = homeTeamGoals;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTeamGoals() {
        return awayTeamGoals;
    }

    public void setAwayTeamGoals(String awayTeamGoals) {
        this.awayTeamGoals = awayTeamGoals;
    }

    public String getWinConditions() {
        return winConditions;
    }

    public void setWinConditions(String winConditions) {
        this.winConditions = winConditions;
    }

    public String getReferee() {
        return referee;
    }

    public void setReferee(String referee) {
        this.referee = referee;
    }

    public String getHomeTeamInitials() {
        return homeTeamInitials;
    }

    public void setHomeTeamInitials(String homeTeamInitials) {
        this.homeTeamInitials = homeTeamInitials;
    }

    public String getAwayTeamInitials() {
        return awayTeamInitials;
    }

    public void setAwayTeamInitials(String awayTeamInitials) {
        this.awayTeamInitials = awayTeamInitials;
    }
}
