package com.example.petslife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    Button addPet;
    String add_pet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        RecyclerView PetsList = findViewById(R.id.pets_list);

        PetsList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));

        ArrayList<Pets> list = new ArrayList<>();
        final PetsAdapter adapter = new PetsAdapter(list);

        PetsList.setAdapter(adapter);

        Button button = findViewById(R.id.add_pet);
        addPet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
