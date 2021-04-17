package com.example.clockscreen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        World_Time data = new World_Time();

        RecyclerView r = findViewById(R.id.timesList);
        r.setLayoutManager( new LinearLayoutManager(this));
        r.setAdapter(new searchAdapter(data));

    }
    public void onClick(View view) {
        Intent i = new Intent(this, Search.class);
        //i.putExtra("message","FUCK OFF");
        startActivity(i);
    }
    /*protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //if (requestCode == EDIT_TRAININGDAY_RESPONSE) {
            if (resultCode == RESULT_OK) {

                //Intent intent = getIntent();
                ArrayList<String> newExerciseList = (ArrayList<String>) data.getSerializableExtra("checkboxlist");

            }
        //}
    }*/
}