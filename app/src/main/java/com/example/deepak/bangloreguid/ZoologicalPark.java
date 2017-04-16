package com.example.deepak.bangloreguid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ZoologicalPark extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoological_park);

        String zoo = "Bannergatta National is one of the elephant and big cats reserve in India";

         /* creat a Array of string and image id*/
        ArrayList<guid> guid = new ArrayList<guid>();
        guid .add(new guid(zoo, R.drawable.zoo));


        // Display using java( Set the rootview)
        guidAdapter adapter = new guidAdapter(this,guid);
        ListView listView = (ListView)findViewById(R.id.list_item);
        listView.setAdapter(adapter);



    }
}
