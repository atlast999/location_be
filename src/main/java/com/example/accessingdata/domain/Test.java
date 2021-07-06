package com.example.accessingdata.domain;

import javax.persistence.*;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    @Id
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}