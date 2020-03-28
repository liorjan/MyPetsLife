package com.example.petslife;

import java.util.ArrayList;
import java.util.List;

public class DataManager {

    private static  DataManager instance = new DataManager();
    private List<Pet> pets;

    private DataManager(){
        pets=new ArrayList<>();
    }

    public static DataManager getInstance() {
        return instance;
    }


    public List<Pet> getPets() {
        return pets;
    }

    public void addPet(Pet pet){
        pets.add(pet);
    }
}
