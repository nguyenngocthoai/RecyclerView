package com.example.recyclerviewbasic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private ArrayList<USB> arrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rcvName);

        arrayList = new ArrayList<>();
        arrayList.add(new USB(R.drawable.carbusbtops,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.daucam,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.dauchuyendoi,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.dauchuyendoipsps2,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.daynguon,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.carbusbtops,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.daucam,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.dauchuyendoi,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.dauchuyendoipsps2,"Dây cáp",69.990));
        arrayList.add(new USB(R.drawable.daynguon,"Dây cáp",69.990));


        adapter = new CustomAdapter(this, arrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}