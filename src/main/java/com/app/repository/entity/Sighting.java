package com.app.repository.entity;

import jakarta.persistence.*;


@Entity
public class Sighting {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "bird_id", nullable = false)
    private Bird bird;

    @Column
    private String location;

    @Column
    private String datetime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        location = location;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String sighting) {
        this.datetime = datetime;
    }
}
