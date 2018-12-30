package com.cafedroid.musicplayerapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Songs> {
    public SongsAdapter(@NonNull Context context, ArrayList<Songs> Song) {
        super(context, 0,Song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);

        }
        Songs item = getItem(position);
        TextView singerTextView = (TextView)listItemView.findViewById(R.id.textView);
        singerTextView.setText(item.getSongName());
        return listItemView;
    }
}
