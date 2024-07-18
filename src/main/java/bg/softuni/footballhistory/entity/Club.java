package bg.softuni.footballhistory.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clubs")
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String nationality;
    @Column(name = "founded_on")
    private LocalDate foundedOn;

    private int trophies;
    private String logo;
    @OneToMany(mappedBy = "currentClub")
    private List<Player> players;

    public Club() {
        this.players = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public Club setPlayers(List<Player> players) {
        this.players = players;
        return this;
    }

    public Club setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Club setName(String name) {
        this.name = name;
        return this;
    }

    public String getNationality() {
        return nationality;
    }

    public Club setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    public LocalDate getFoundedOn() {
        return foundedOn;
    }

    public Club setFoundedOn(LocalDate foundedOn) {
        this.foundedOn = foundedOn;
        return this;
    }

    public int getTrophies() {
        return trophies;
    }

    public Club setTrophies(int trophies) {
        this.trophies = trophies;
        return this;
    }

    public String getLogo() {
        return logo;
    }

    public Club setLogo(String logo) {
        this.logo = logo;
        return this;
    }
}
