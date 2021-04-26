package com.company.Мост;

import com.company.Мост.devices.Device;
import com.company.Мост.devices.Radio;
import com.company.Мост.devices.TV;
import com.company.Мост.remotes.AdvancedRemote;
import com.company.Мост.remotes.BasicRemote;

public class Main {

    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
