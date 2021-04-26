package com.company.Decorator;

public class Verse extends SongDecorator {

    public Verse(Song c) {
        super(c);
    }

    @Override
    public void create(){
        super.create();
        System.out.print(" added smooth verse.");
    }
}
