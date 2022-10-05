package model;

import jakarta.persistence.*;

@Entity
public class WorldCupMatches {

    @Id
    @Column(name = "MatchID")
    private int matchId;

    @JoinColumn(name = "Year_Cup")
    @OneToOne(cascade= CascadeType.ALL)
    private WorldCups yearCup;

    @Column(name = "Datetime")
    private String dateTime;
    @Column(name = "Stage")
    private String stage;
    @Column(name = "Stadium")
    private String stadium;
    @Column(name = "City")
    private String city;
    @Column(name = "Home_Team_Name")
    private String homeTeamName;
    @Column(name = "Home_Team_Goals")
    private String homeTeamGoals;
    @Column(name = "Away_Team_Name")
    private String awayTeamName;
    @Column(name = "Away_Team_Goals")
    private String awayTeamGoals;
    @Column(name = "Win_conditions")
    private String winConditions;
    @Column(name = "Referee")
    private String referee;
    @Column(name = "Home_Team_Initials")
    private String homeTeamInitials;
    @Column(name = "Away_Team_Initials")
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

    @Override
    public String toString() {
        return "WorldCupMatches{" +
                "matchId=" + matchId +
                ", yearCup=" + yearCup +
                ", dateTime='" + dateTime + '\'' +
                ", stage='" + stage + '\'' +
                ", stadium='" + stadium + '\'' +
                ", city='" + city + '\'' +
                ", homeTeamName='" + homeTeamName + '\'' +
                ", homeTeamGoals='" + homeTeamGoals + '\'' +
                ", awayTeamName='" + awayTeamName + '\'' +
                ", awayTeamGoals='" + awayTeamGoals + '\'' +
                ", winConditions='" + winConditions + '\'' +
                ", referee='" + referee + '\'' +
                ", homeTeamInitials='" + homeTeamInitials + '\'' +
                ", awayTeamInitials='" + awayTeamInitials + '\'' +
                '}';
    }
}
