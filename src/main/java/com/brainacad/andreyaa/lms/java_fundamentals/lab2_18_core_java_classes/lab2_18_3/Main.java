package com.brainacad.andreyaa.lms.java_fundamentals.lab2_18_core_java_classes.lab2_18_3;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

class Main {

    public static void main(String[] args) {

        Locale.setDefault(new Locale("uk", "UA"));
        Locale current = Locale.getDefault();

        System.out.println("DEFAULT");
        getLocaleInfo(current);
        Date date = new Date();
        System.out.println("Date: " + date);
        System.out.println("Time in milliseconds: " + date.getTime());
        System.out.println();

        Locale rus = new Locale("ru", "RU");
        Locale ch = Locale.CHINA;
        Locale it = Locale.ITALY;

        System.out.println("RUSSIA");
        Locale.setDefault(rus);
        getLocaleInfo(rus);
        System.out.println();

        System.out.println("CHINA");
        Locale.setDefault(ch);
        getLocaleInfo(ch);
        System.out.println();

        System.out.println("ITALY");
        Locale.setDefault(it);
        getLocaleInfo(it);

    }

    static void getLocaleInfo(Locale current) {

        System.out.println("Current Locale: " + current.getCountry());
        System.out.println("Region name: " + current.getDisplayCountry());
        System.out.println("Code of the region language: " + current.getLanguage());
        System.out.println("Name of the region language: " + current.getDisplayLanguage());

        long L = 2_430_000_000_000L;
        double d = 0.002;
        NumberFormat numberFormat = NumberFormat.getInstance();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        System.out.println("Integer: " + numberFormat.format(L));
        System.out.println("Double: " + numberFormat.format(d));

        System.out.println("Currency: " + currency.getCurrency() + ": " + currency.format(L));

    }

}
