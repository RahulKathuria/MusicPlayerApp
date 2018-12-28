package com.cafedroid.musicplayerapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

public class SongsAdapter extends ArrayAdapter<Songs> {

    public SongsAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }
}
