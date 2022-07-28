package com.example.restwithspring.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Todos {

    @Id
    private int id;

    private String title;

    private String description;


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
