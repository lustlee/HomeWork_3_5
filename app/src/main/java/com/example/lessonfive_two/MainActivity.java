package com.example.lessonfive_two;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(manager);

        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(0, new ItemModel("One Piece Ророноа Зорро", R.drawable.zorro));
        list.add(1, new ItemModel("One Piece Монки Д. Луффи", R.drawable.one_piece_luffy));
        list.add(2, new ItemModel("One Piece Портгас Д. Эйс", R.drawable.one_piece_ace));

        adapter.addText(list);

    }
}