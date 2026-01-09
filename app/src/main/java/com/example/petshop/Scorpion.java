package com.example.petshop;

import java.util.Date;

public class Scorpion extends Pet {

    // Constructor with name only
    public Scorpion(String name) {
        super(name);
    }

    // Constructor with name and birthDate
    public Scorpion(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Must override abstract method from Pet
    @Override
    public String speak() {
        return "hiss";
    }
}
