package com.example.deepak.bangloreguid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find view that shows the BanglorePalace activity
        TextView BanglorePalace = (TextView) findViewById(R.id.BanglorePalace);
        //set  click listener on the view
        BanglorePalace.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // creat new intent to open BanglorePalace activity
                Intent BanglorePalaceIntent = new Intent(MainActivity.this, BanglorePalace.class);
                // start the new activity
                startActivity(BanglorePalaceIntent);
            }
        });

        // find view that shows the ZoologicalPark activity
        TextView ZoologicalPark = (TextView) findViewById(R.id.Zoo);
        //set  click listener on the view
        ZoologicalPark.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // creat new intent to open  ZoologicalPark activity
                Intent ZoologicalParkIntent = new Intent(MainActivity.this, ZoologicalPark.class);
                // start the new activity
                startActivity(ZoologicalParkIntent);
            }
        });

        // find view that shows the Lalbag activity
        TextView Lalbag = (TextView) findViewById(R.id.Lalbag);
        //set  click listener on the view
        Lalbag.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // creat new intent to open LalbagBotanicalGarden activity
                Intent LalbagIntent = new Intent(MainActivity.this, Lalbag.class);
                // start the new activity
                startActivity(LalbagIntent);
            }
        });

        // find view that shows the FoodStreet activity
        TextView FoodStreet = (TextView) findViewById(R.id.FoodStreet);
        //set  click listener on the view
        FoodStreet.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                // creat new intent to open FoodStreet activity
                Intent FoodStreetIntent = new Intent(MainActivity.this, FoodStreet.class);
                // start the new activity
                startActivity(FoodStreetIntent);
            }
        });


    }
}
