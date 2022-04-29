package com.example.finalproject;

public class User {
    private int id;
    private String name;
    private Double height;


    public User(int id, String name, Double height) {
        this.id = id;
        this.name = name;
        this.height = height;
    }

    public User(String name, Double height) {
        this.name = name;
        this.height = height;
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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }
}
