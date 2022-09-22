package model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Embeddable
public class WorldCups {
    @Id
    @Column(name = "Year")
    private int year;
    @Column(name = "Country")
    private String country;
    @Column(name = "Winner")
    private String winner;
    @Column(name = "RunnersUp")
    private String runnersUp;
    @Column(name = "Third")
    private String third;
    @Column(name = "Fourth")
    private String fourth;
    @Column(name = "GoalsScored")
    private int goalsScored;
    @Column(name = "QualifiedTeams")
    private int qualifiedTeams;
    @Column(name = "MatchesPlayed")
    private int matchesPlayed;
    @Column(name = "Attendance")
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

    @Override
    public String toString() {
        return "WorldCups{" +
                "year=" + year +
                ", country='" + country + '\'' +
                ", winner='" + winner + '\'' +
                ", runnersUp='" + runnersUp + '\'' +
                ", third='" + third + '\'' +
                ", fourth='" + fourth + '\'' +
                ", goalsScored=" + goalsScored +
                ", qualifiedTeams=" + qualifiedTeams +
                ", matchesPlayed=" + matchesPlayed +
                ", attendance='" + attendance + '\'' +
                '}';
    }
}
