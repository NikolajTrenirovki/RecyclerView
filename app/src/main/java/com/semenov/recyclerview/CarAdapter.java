package com.semenov.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    ArrayList<Car> car;

    public CarAdapter(ArrayList<Car> car) {
        this.car = car;
    }

    public class CarViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView desc;
        public CarViewHolder(@NonNull View view) {
            super(view);
            img = (ImageView) view.findViewById(R.id.car);
            desc = (TextView) view.findViewById(R.id.desc);
        }
    }

    @NonNull
    @Override
    public CarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CarViewHolder holder, int position) {
        holder.desc.setText(car.get(position).getDescription());
        holder.img.setImageResource(car.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return car.size();
    }

}
