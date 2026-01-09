package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {

    // Constructor with name only
    public Cat(String name) {
        super(name); // calls Pet(String name)
    }

    // Constructor with name and birthDate
    public Cat(String name, Date birthDate) {
        super(name, birthDate); // calls Pet(String, Date)
    }

    // Override abstract method from Pet
    @Override
    public String speak() {
        return "meow";
    }

    // Implement method from Pettable interface
    @Override
    public Void pet() {
        return null;
    }
}

