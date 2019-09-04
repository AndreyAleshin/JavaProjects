package com.github.andreyaleshin.HeadFirstJava;

import static java.lang.System.out;

import java.util.*;


class FullMoons {

    static int DAY_IM = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {

        Calendar c = Calendar.getInstance();
        c.set(2019, 0, 21, 7, 16);

        long day1 = c.getTimeInMillis();

        for (int x = 0; x < 60; x++) {

            day1 += (DAY_IM * 29.5306);
            c.setTimeInMillis(day1);
            out.println(String.format("Полнолуние было в %tc", c));
        }

    }
    
}
