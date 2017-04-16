package com.example.deepak.bangloreguid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FoodStreet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_street);

        String foodadd = "VasanthNagar food street is one of the destintions for delicious food in Banglore";

         /* creat a Array of string and image id*/
        ArrayList<guid> guid = new ArrayList<guid>();
        guid .add(new guid(foodadd, R.drawable.food));


        // Display using java( Set the rootview)
        guidAdapter adapter = new guidAdapter(this,guid);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);

    }
}
