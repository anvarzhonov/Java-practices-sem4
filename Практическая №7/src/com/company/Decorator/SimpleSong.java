package com.company.Decorator;

public class SimpleSong implements Song {

    @Override
    public void create() {
        System.out.print("To simple song");
    }

}