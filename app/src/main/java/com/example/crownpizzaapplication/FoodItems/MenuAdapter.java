package com.example.crownpizzaapplication.FoodItems;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crownpizzaapplication.R;


import java.util.ArrayList;


public class MenuAdapter
        extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder>{


    ArrayList<FoodItem> pizzaList;

    public MenuAdapter(ArrayList<FoodItem> pizzaList){
        this.pizzaList = pizzaList;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.menu_item, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        FoodItem currentItem = pizzaList.get(position);
        holder.image.setImageResource(currentItem.getDrawable());
        holder.name.setText(currentItem.getName());
        holder.size.setText(currentItem.getSize());
        holder.price.setText("$" + String.valueOf(currentItem.getPrice()));


    }

    @Override
    public int getItemCount() {
        if(pizzaList != null){
            return pizzaList.size();
        }
        return 0;
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        protected ImageView image;
        protected TextView name;
        protected TextView price;
        protected TextView size;

        public MenuViewHolder(@NonNull View itemView) {
            super(itemView);
            this.name = itemView.findViewById(R.id.name);
            this.price = itemView.findViewById(R.id.price);
            this.image = itemView.findViewById(R.id.image);
            this.size = itemView.findViewById(R.id.description);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            FoodItem currentItem = pizzaList.get(getAdapterPosition());
            Bundle bundle = new Bundle();
            bundle.putString("NAME", currentItem.getName());
            bundle.putInt("DRAWABLE", currentItem.getDrawable());
            bundle.putString("SIZE", currentItem.getSize());

            Navigation.findNavController(v)
                    .navigate(R.id.action_menuList_to_foodDetails, bundle);
        }
    }
}
