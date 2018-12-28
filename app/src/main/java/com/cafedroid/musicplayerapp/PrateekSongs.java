package com.cafedroid.musicplayerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class PrateekSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ArrayList<Songs> SongArray = new ArrayList<Songs>();
        SongArray.add(new Songs("Prateek Kuhad","Song1"));
        SongArray.add(new Songs("Prateek Kuhad","Song2"));
        SongArray.add(new Songs("Prateek Kuhad","Song3"));
        SongsAdapter adapter = new SongsAdapter(this,SongArray);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }
}

