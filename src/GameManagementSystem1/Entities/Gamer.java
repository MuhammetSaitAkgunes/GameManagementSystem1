package GameManagementSystem1.Entities;

import GameManagementSystem1.Abstract.Entity;
import java.util.List;

public class Gamer implements Entity {
    int id;
    String name;
    int birthYear;
    List games;


    public Gamer(int id, String name, int birthYear, List games) {
        this.id = id;
        this.name = name;
        this.birthYear = birthYear;
        this.games = games;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List getGames() {
        return games;
    }

    public void setGames(List games) {
        this.games = games;
    }
}
