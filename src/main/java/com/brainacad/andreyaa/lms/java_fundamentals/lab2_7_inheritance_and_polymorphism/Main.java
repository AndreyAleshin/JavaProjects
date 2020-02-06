package com.brainacad.andreyaa.lms.java_fundamentals.lab2_7_inheritance_and_polymorphism;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Lab 2-7-5
        Device[] devices = new Device[3];
        for (int i = 0; i < devices.length; i++) {
            devices[i] = new Device("Xiaomi", 300, "123");
        }
        System.out.println("DEVICES");
        System.out.println(Arrays.toString(devices));
        System.out.println(devices[0].equals(devices[1]));
        System.out.println(Arrays.hashCode(devices) + "\n");

        Monitor[] monitors = new Monitor[3];
        for (int i = 0; i < monitors.length; i++) {
            monitors[i] = new Monitor("ASUS", 400, "456",
                    1920, 1080);
        }
        System.out.println("MONITORS");
        System.out.println(Arrays.toString(monitors));
        System.out.println(monitors[0].equals(devices[2]));
        System.out.println(Arrays.hashCode(monitors) + "\n");

        EthernetAdapter[] ethernetAdapters = new EthernetAdapter[3];
        for (int i = 0; i < ethernetAdapters.length; i++) {
            ethernetAdapters[i] = new EthernetAdapter("TP-Link", 50, "678",
                    150, "255");
        }
        System.out.println("ETHERNET ADAPTERS");
        System.out.println(Arrays.toString(ethernetAdapters));
        System.out.println(ethernetAdapters[1].equals(devices[0]));
        System.out.println(Arrays.hashCode(ethernetAdapters));

    }

}
