package com.example.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mrecyclerView;
    private RecyclerView.Adapter madapter;
    private RecyclerView.LayoutManager mlayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ArrayList<ExampleItem> examplelist = new ArrayList<>();
       examplelist.add(new ExampleItem("Python","12457","shreyansh","08/03/2019","30/06/2019"));
       examplelist.add(new ExampleItem("Python","12457","shreyansh","08/03/2019","30/06/2019"));
       examplelist.add(new ExampleItem("Python","12457","shreyansh","08/03/2019","30/06/2019"));
       examplelist.add(new ExampleItem("Python","12457","shreyansh","08/03/2019","30/06/2019"));
       examplelist.add(new ExampleItem("Python","12457","shreyansh","08/03/2019","30/06/2019"));


       mrecyclerView = findViewById(R.id.recyclerview);
       mrecyclerView.setHasFixedSize(true);
       mlayoutManager = new LinearLayoutManager(this);
       madapter = new ExampleAdapter(examplelist);

       mrecyclerView.setLayoutManager(mlayoutManager);
       mrecyclerView.setAdapter(madapter);

    }
}
