package com.company.Decorator;

public class SongDecorator implements Song {

    protected Song song;

    public SongDecorator(Song c){
        this.song = c;
    }

    @Override
    public void create() {
        this.song.create();
    }

}
