package nt.ehb.nielstanghe.models;

import jakarta.persistence.*;

import java.util.List;
import java.util.ArrayList;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;
    private String adress;
    private int capacity;

    @OneToMany(mappedBy = "location")
    private List<Event> events = new ArrayList<>();

    public Location(String name, String adress, int capacity) {
        this.name = name;
        this.adress = adress;
        this.capacity = capacity;
    }

    public Location() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
