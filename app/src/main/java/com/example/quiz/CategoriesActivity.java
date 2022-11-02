package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class CategoriesActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        Toolbar toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Categories");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recyclerView.setLayoutManager(layoutManager);

        List<CategoryModel> list = new ArrayList<>();
        list.add(new CategoryModel("", "Category1"));
        list.add(new CategoryModel("", "Category2"));
        list.add(new CategoryModel("", "Category3"));
        list.add(new CategoryModel("", "Category4"));
        list.add(new CategoryModel("", "Category5"));
        list.add(new CategoryModel("", "Category6"));
        list.add(new CategoryModel("", "Category7"));
        list.add(new CategoryModel("", "Category8"));
        list.add(new CategoryModel("", "Category9"));
        list.add(new CategoryModel("", "Category10"));
        list.add(new CategoryModel("", "Category11"));
        list.add(new CategoryModel("", "Category12"));


        CategoryAdapter adapter = new CategoryAdapter(list);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == android.R.id.home){
            finish();
        }

        return super.onOptionsItemSelected(item);
    }
}