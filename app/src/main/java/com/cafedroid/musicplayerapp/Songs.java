package com.cafedroid.musicplayerapp;

public class Songs {

    private String mSinger;
    private String mSong;


    public Songs(String singer,String song){
        mSinger = singer;
        mSong = song;

    }
    public String getSingerName(){
        return mSinger;
    }
    public String getSongName(){
        return mSong;
    }
}
