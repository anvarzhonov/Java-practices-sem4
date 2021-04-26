package com.company.Decorator;

public class DecoratorPatternTest {

    public static void main(String[] args) {
        Song heavySong = new Verse(new SimpleSong());
        heavySong.create();
        System.out.println("\n");

        Song bestSong = new Verse(new HeavyRiff(new SimpleSong()));
        bestSong.create();
    }
}
