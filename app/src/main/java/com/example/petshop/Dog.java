package com.example.petshop;

import java.util.Date;

public class Dog extends Pet implements Pettable {

    // Constructor with name only
    public Dog(String name) {
        super(name);
    }

    // Constructor with name and birthDate
    public Dog(String name, Date birthDate) {
        super(name, birthDate);
    }

    // Override abstract method from Pet
    @Override
    public String speak() {
        return "bark";
    }

    // Implement Pettable interface
    @Override
    public Void pet() {
        return null;
    }
}

