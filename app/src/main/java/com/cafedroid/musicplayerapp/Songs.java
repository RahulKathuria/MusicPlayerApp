package com.cafedroid.musicplayerapp;

public class Songs {

    private String mSinger;
    private String mSong;


    public Songs(String singer,String song){
        this.mSinger = singer;
        this.mSong = song;

    }
    public String getSingerName(){
        return mSinger;
    }
    public String getSongName(){
        return mSong;
    }

   
}
