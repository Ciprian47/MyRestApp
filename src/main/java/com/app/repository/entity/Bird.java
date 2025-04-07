package com.app.repository.entity;

import jakarta.persistence.*;

@Entity
public class Bird {


    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String collor;

    @Column
    private String weight;

    @Column
    private String height;

    public synchronized  long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollor() {
        return collor;
    }

    public void setCollor(String collor) {
        this.collor = collor;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
