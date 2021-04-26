package com.company.Decorator;

public class HeavyRiff extends SongDecorator {

    public HeavyRiff(Song c) {
        super(c);
    }

    @Override
    public void create(){
        super.create();
        System.out.print(" added heavy riff");
    }
}
