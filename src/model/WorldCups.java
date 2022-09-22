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
}
