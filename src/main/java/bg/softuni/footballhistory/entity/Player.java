package bg.softuni.footballhistory.entity;

import jakarta.persistence.*;
import org.hibernate.validator.constraints.URL;

@Entity
@Table(name = "players")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nationality;
    @Column(name = "career_goals")
    private int careerGoals;

    @ManyToOne
    private Club currentClub;

    private String picture;

    public Player() {
    }

    public Long getId() {
        return id;
    }

    public Player setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Player setName(String name) {
        this.name = name;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Player setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public int getCareerGoals() {
        return careerGoals;
    }

    public Player setCareerGoals(int careerGoals) {
        this.careerGoals = careerGoals;
        return this;
    }

    public Club getCurrentClub() {
        return currentClub;
    }

    public Player setCurrentClub(Club currentClub) {
        this.currentClub = currentClub;
        return this;
    }

    public String getPicture() {
        return picture;
    }

    public Player setPicture(String picture) {
        this.picture = picture;
        return this;
    }
}
