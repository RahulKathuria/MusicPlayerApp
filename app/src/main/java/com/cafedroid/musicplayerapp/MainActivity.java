package com.cafedroid.musicplayerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView prateek;
    TextView localTrain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prateek = (TextView) findViewById(R.id.prateek);
        localTrain = (TextView) findViewById(R.id.localTrain);
        prateek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, PrateekSongs.class);
                startActivity(i);
            }

        });
        localTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, LocalTrainSongs.class);
                startActivity(i);
            }
        });


    }


}
