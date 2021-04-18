package com.example.clockscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private World_Time dataw=new World_Time();
    private RecyclerView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = findViewById(R.id.timesList);
        r.setLayoutManager( new LinearLayoutManager(this));
    }
    public void onClick(View view) {
        Intent i = new Intent(this, Search.class);
        startActivityForResult(i,1); //for starting the new activity
    }

    //for getting result from the previous activity
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                ArrayList<String> cnames = (ArrayList<String>) data.getSerializableExtra("checklist");
                dataw.setCountryList(cnames);
                dataw.setCountryTime("12:30 AM");
                r.setAdapter(new ProgrammingAdapter(dataw));

            }
        }
    }
}