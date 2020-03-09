package com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_1_2_3;

enum MyDayOfTheWeek {

    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    MyDayOfTheWeek nextDay() {
        MyDayOfTheWeek[] daysOfTheWeek = MyDayOfTheWeek.values();
        int nextIndex = ordinal();
        return daysOfTheWeek[++nextIndex];
    }

}
