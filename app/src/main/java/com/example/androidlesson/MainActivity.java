package com.example.androidlesson;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewChats;
    private FakeDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializeUI();
        initializeDatabase();
        configureRecyclerViewChats();
    }

    private void initializeUI() {
        recyclerViewChats = findViewById(R.id.recycler_view_chats);
    }

    private void configureRecyclerViewChats() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewChats.setLayoutManager(layoutManager);

        RecyclerViewChatsAdapter adapter = new RecyclerViewChatsAdapter();
        recyclerViewChats.setAdapter(adapter);

        adapter.submitList(database.getListOfChats());
    }

    private void initializeDatabase() {
        database = new FakeDatabase();
    }

}