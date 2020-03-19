package com.example.petslife;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PetsAdapter extends RecyclerView.Adapter<PetsAdapter.PetsViewHolder> {

    private final ArrayList<Pets> petsList;
    private ArrayList<Pets> Petslist = new ArrayList<>();
    private Object View;

    public PetsAdapter(ArrayList<Pets> personList) {
        this.petsList = personList;
    }

    public void addPerson(Pets person){
        petsList.add(person);
        notifyDataSetChanged();
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public PetsAdapter.PetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view = LayoutInflater.from(parent.getContext()).inflate(R.id.add_pet,parent,false);
        return new PetsViewHolder(View);
    }

    @Override
    public void onBindViewHolder(@NonNull PetsAdapter.PetsViewHolder holder, int position) {
        holder.name.setText(Petslist.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return Petslist.size();
    }

     class PetsViewHolder extends RecyclerView.ViewHolder {

        TextView name;

         PetsViewHolder(Object view) {
            super((android.view.View) View);
            name = itemView.findViewById(R.id.pets_list);
        }
    }
}
