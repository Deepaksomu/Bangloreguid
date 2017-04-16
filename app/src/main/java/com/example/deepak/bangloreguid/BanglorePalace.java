package com.example.deepak.bangloreguid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class BanglorePalace extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_banglore_palace);

        String Palaceadd = "BanglorePalace was built by the wodeyar dynasty who ruled southern parts of India called Mysore\n" +
                "    Banglore palace is called summer paplace of Tippu Sultan";
        /* creat a Array of string and image id*/
        ArrayList<guid> guid = new ArrayList<guid>();
       guid .add(new guid(Palaceadd, R.drawable.palace));


        // Display using java( Set the rootview)
        guidAdapter adapter = new guidAdapter(this,guid);
        ListView listView = (ListView)findViewById(R.id.list_item);
        listView.setAdapter(adapter);



    }
}
