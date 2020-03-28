package com.example.petslife.activities;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.petslife.DataManager;
import com.example.petslife.Pet;
import com.example.petslife.R;

public class CreatePetActivity extends AppCompatActivity {

    EditText pet_name;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pet_create);

        pet_name = findViewById(R.id.pet_name);

        findViewById(R.id.save_user).setOnClickListener(v -> {
            // TODO: 28/03/20 Save to dataBase

            String name = pet_name.getText().toString();
            if (name.isEmpty()){
                pet_name.setError("Fill you bitch!");
                return;
            }

            DataManager.getInstance().addPet(new Pet(name));
            setResult(RESULT_OK);
            finish();

        });
    }
}
