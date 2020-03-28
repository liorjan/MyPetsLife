package com.example.petslife.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.petslife.R;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.LoginBtn).setOnClickListener(v -> {
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.RegisterBtn).setOnClickListener(v -> {

            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);

        });

    }


}