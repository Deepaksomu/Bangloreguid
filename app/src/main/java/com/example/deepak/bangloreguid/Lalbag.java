package com.example.deepak.bangloreguid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Lalbag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lalbag);
        String garden= "Lalbag Botanical Garden was created by Kempe Gowda to mark a boundry pillar of Banglore";

         /* creat a Array of string and image id*/
        ArrayList<guid> guid = new ArrayList<guid>();
        guid .add(new guid(garden));


        // Display using java( Set the rootview)
        guidAdapter adapter = new guidAdapter(this,guid);
        ListView listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);


    }
}
