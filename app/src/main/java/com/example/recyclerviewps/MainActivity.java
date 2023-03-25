package com.example.recyclerviewps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
//import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
//    ListView listView;
    private String[] legends =  {"Elon Musk", "Jeff Bezos", "Bill Gates", "Mark Zuckerberg", "Steve Jobs", "Larry Page", "Sergey Brin", "Jack Ma", "Richard Branson", "Warren Buffett", "Oprah Winfrey", "Mark Cuban", "Michael Dell", "Reid Hoffman", "Kevin Systrom", "Travis Kalanick", "Brian Chesky", "Joe Gebbia", "Nathan Blecharczyk", "David Karp"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(legends);
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
//        listView = findViewById(R.id.listView);
//        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1, legends);
//        listView.setAdapter(ad);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "Clicked: " + i, Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}