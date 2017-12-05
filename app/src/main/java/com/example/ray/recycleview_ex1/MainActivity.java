package com.example.ray.recycleview_ex1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] dataList = new String[]{"iOS", "Android", "Windows", "Mac", "Superman", "Idiot", "Bad guys", "Reindeer", "Elk", "Skunk", "Raccoon"};

        RecyclerView recyclerView = findViewById(R.id.recycleView_mian);
        MyRecyclerViewAdapter myRecyclerViewAdapter = new MyRecyclerViewAdapter(this, dataList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));       //一定要有一個layoutManager
        recyclerView.setAdapter(myRecyclerViewAdapter);
    }
}
