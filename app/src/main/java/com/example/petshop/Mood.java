package com.example.petshop;

import java.util.Date;

public abstract class Mood {

    private Date date;

    // Default constructor: sets date to current date
    public Mood() {
        this.date = new Date();
    }

    // Constructor: sets date to given date
    public Mood(Date date) {
        this.date = date;
    }

    // Getter
    public Date getDate() {
        return date;
    }

    // Setter
    public void setDate(Date date) {
        this.date = date;
    }

    // Each mood must describe itself
    public abstract String getMoodString();
}
