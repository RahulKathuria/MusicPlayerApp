package com.cafedroid.musicplayerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class LocalTrainSongs extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);
        ArrayList<Songs> SongArray = new ArrayList<Songs>();
        SongArray.add(new Songs("Local Train","Khudi"));
        SongArray.add(new Songs("Local Train","Aaftab"));
        SongArray.add(new Songs("Local Train","Aaoge Tum Kabhi"));
        SongsAdapter adapter = new SongsAdapter(this,SongArray);
        ListView listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);


    }
}
