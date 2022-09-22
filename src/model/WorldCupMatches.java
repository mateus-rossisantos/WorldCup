package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WorldCupMatches {
    @Id
    private int matchId;
    private int yearCup;
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
}
