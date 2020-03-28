package com.example.petslife.activities;

import android.content.Intent;
import android.os.Bundle;

import com.example.petslife.DataManager;
import com.example.petslife.PetsAdapter;
import com.example.petslife.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    private static final String TAG = "ProfileActivity";

    PetsAdapter adapter;
    final int REQUEST_CODE = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile4);

        RecyclerView recyclerView = findViewById(R.id.pets_list);
        
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new PetsAdapter(DataManager.getInstance().getPets());
        recyclerView.setAdapter(adapter);
        adapter.setListener(pet->{
             Toast.makeText(this, pet.getName(), Toast.LENGTH_SHORT).show();
        });

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(v -> {
            Log.d(TAG,"onClick: pressed!");
            startActivityForResult(new Intent(this, CreatePetActivity.class)
                    ,REQUEST_CODE);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == REQUEST_CODE &&resultCode== RESULT_OK){
           int i= DataManager.getInstance().getPets().size() -1;
            adapter.notifyItemInserted(i);
        }
    }
}
