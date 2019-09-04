package com.github.andreyaleshin.HeadFirstJava.CollectionsAndGenerics;

import java.util.*;

public class SortMountains {

    LinkedList<Mountain> mtn = new LinkedList<Mountain>();

    static class NameCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return one.name.compareTo(two.name);
        }
    }

    static class HeightCompare implements Comparator<Mountain> {
        public int compare(Mountain one, Mountain two) {
            return (two.height - one.height);
        }

    }

    public static void main(String[] args) {
        new SortMountains().go();
    }

    public void go() {
        mtn.add(new Mountain("Long Range", 14255));
        mtn.add(new Mountain("Elbert", 14433));
        mtn.add(new Mountain("Maroon", 14156));
        mtn.add(new Mountain("Castle", 14265));

        System.out.println("In order of adding: \n" + mtn);

        NameCompare nc = new NameCompare();
        Collections.sort(mtn, nc);
        System.out.println("By the name: \n" + mtn);

        HeightCompare hc = new HeightCompare();
        Collections.sort(mtn, hc);
        System.out.println("By the height: \n" + mtn);
    }

}

class Mountain {

    String name;
    int height;

    Mountain(String name, int height) {
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + height;
    }

}
