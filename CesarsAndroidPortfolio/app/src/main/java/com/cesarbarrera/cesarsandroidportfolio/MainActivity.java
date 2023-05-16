package com.cesarbarrera.cesarsandroidportfolio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.recycler_view_projects);


        Project [] projects = {

                new Project("Getting Started App", "Our very first project Hello World App !", R.drawable.getting_started),
                new Project("Inspirational Quote", "Quote for programmers", R.drawable.quote),
                new Project("BMI Calculator", " Measures your BMI ", R.drawable.calculator),
                new Project("Unit Measurement Converter", "calculates meters to inches", R.drawable.tape),
                new Project("The Blue Dragon", "Restaurant app ", R.drawable.hungry_developer),
        };

        ProjectsAdapter adapter = new ProjectsAdapter(projects);
        list.setAdapter(adapter);

    }
}