package com.example.petslife;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PetsAdapter extends RecyclerView.Adapter<PetsAdapter.ViewHolder>  {

    private List<Pet> pets;

    public void setListener(OnPetClickedListener listener) {
        this.listener = listener;
    }

    private OnPetClickedListener listener;

    public PetsAdapter(List<Pet> pets) {
        this.pets = pets;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pets_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PetsAdapter.ViewHolder holder, int position) {
        Pet pet = pets.get(position);
        holder.pet_name.setText(pet.getName());

        holder.itemView.setOnClickListener(v->{
            if (listener != null) {
                listener.onPetClicked(pet);
            }
        });
    }



    @Override
    public int getItemCount() {
        return pets.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView pet_name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            pet_name = itemView.findViewById(R.id.first_name);
        }
    }
}
