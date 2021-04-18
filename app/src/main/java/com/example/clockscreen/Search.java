package com.example.clockscreen;

import androidx.appcompat.app.AppCompatActivity;


//import android.app.ActionBar;
import androidx.appcompat.app.ActionBar;
import android.content.Intent;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Search extends AppCompatActivity {

    private  searchAdapter adapter;
    private World_Time w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        RecyclerView recyclerView = findViewById(R.id.recuc);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        w = new World_Time();
        adapter = new searchAdapter(w);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        SearchView s = findViewById(R.id.sear);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();
        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        s.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return true;
            }

        });
    }
    //for sending data along with moving to previous activity
    public void onBackPressed(){
        ArrayList<String> cboxlist=adapter.getCboxList();
        Intent intent = new Intent();
        intent.putExtra("checklist",cboxlist); //send the checkboxed list to previous activity
        setResult(RESULT_OK, intent);
        finish();
    }
    //for moving to back screen
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

