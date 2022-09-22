package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WorldCups {
    @Id
    private int year;
    private String country;
    private String winner;
    private String runnersUp;
    private String third;
    private String fourth;
    private int goalsScored;
    private int qualifiedTeams;
    private int matchesPlayed;
    private String attendance;


    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getRunnersUp() {
        return runnersUp;
    }

    public void setRunnersUp(String runnersUp) {
        this.runnersUp = runnersUp;
    }

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public String getFourth() {
        return fourth;
    }

    public void setFourth(String fourth) {
        this.fourth = fourth;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getQualifiedTeams() {
        return qualifiedTeams;
    }

    public void setQualifiedTeams(int qualifiedTeams) {
        this.qualifiedTeams = qualifiedTeams;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public String getAttendance() {
        return attendance;
    }

    public void setAttendance(String attendance) {
        this.attendance = attendance;
    }
}
