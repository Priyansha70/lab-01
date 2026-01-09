package com.example.petshop;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // ===== Lab 1 OOP code starts here =====

        // --- Pets ---
        Cat cat = new Cat("Lucy");
        Dog dog = new Dog("Snoopy");
        Scorpion scorpion = new Scorpion("Scorponok");

        // Implicit upcasting (all are Pets)
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(cat);
        petList.add(dog);
        petList.add(scorpion);

        // Interface usage (only Pettable pets)
        ArrayList<Pettable> pettablePets = new ArrayList<>();
        pettablePets.add(cat);
        pettablePets.add(dog);
        /
        // --- Mood classes ---
        Mood happyMood = new HappyMood();
        Mood sadMood = new SadMood();

        // Polymorphism demonstration
        String mood1 = happyMood.getMoodString();
        String mood2 = sadMood.getMoodString();



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}

