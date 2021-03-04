package com.example.lessonfive_two;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainViewHolder extends RecyclerView.ViewHolder {

    TextView nameItem;
    ImageView imageItem;

    public MainViewHolder(@NonNull View itemView) {
        super(itemView);

        nameItem = itemView.findViewById(R.id.main_txt);
        imageItem = itemView.findViewById(R.id.main_img);
    }

    public void onBind(ItemModel data) {
        nameItem.setText(data.name);
        imageItem.setImageResource(data.image);
    }

}
