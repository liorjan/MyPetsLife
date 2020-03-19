package com.example.petslife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    EditText pet_name,pet_color,pet_race;
    Button addPet;
    String add_pet;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        RecyclerView PetsList = findViewById(R.id.pets_list);

        PetsList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        ArrayList<Pets> list = new ArrayList<>();
        final PetsAdapter adapter = new PetsAdapter(list);

        PetsList.setAdapter(adapter);

        pet_name = findViewById(R.id.pet_name);
        pet_color = findViewById(R.id.pet_color);
        pet_race = findViewById(R.id.pet_race);

        addPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pet_name.setText(pet_name.getText().toString());
                pet_color.setText(pet_color.getText().toString());
                pet_race.setText(pet_race.getText().toString());
            }
        });
    }
}
