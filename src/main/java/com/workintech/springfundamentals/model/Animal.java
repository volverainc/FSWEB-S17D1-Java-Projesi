package com.workintech.springfundamentals.model;

public class Animal {
    private int id;
    private String name;



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

    public Animal(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Animal() {
    }
}