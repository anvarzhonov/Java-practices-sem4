package com.company;

public class Singleton2 {
    private static volatile Singleton2 instance;

    public static Singleton2 getInstance() {
        Singleton2 localInstance = instance;
        if (localInstance == null) {
            synchronized (Singleton2.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new Singleton2();
                }
            }
        }
        return localInstance;
    }
}
