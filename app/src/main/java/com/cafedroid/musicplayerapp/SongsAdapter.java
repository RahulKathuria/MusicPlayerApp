package com.cafedroid.musicplayerapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {
    public SongsAdapter(@NonNull Context context, ArrayList<Songs> Song) {
        super(context, 0,Song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}
