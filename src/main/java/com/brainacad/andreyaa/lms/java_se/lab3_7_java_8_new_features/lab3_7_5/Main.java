package com.brainacad.andreyaa.lms.java_se.lab3_7_java_8_new_features.lab3_7_5;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Main {

    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1995, Month.JANUARY, 1);
        Period p = Period.between(dateOfBirth, today);
        int myAge = p.getYears();
        long ageInDays = ChronoUnit.DAYS.between(dateOfBirth, today);
        System.out.println("Today is: " + today);
        System.out.println("My age is: " + myAge + " (age in days - " + ageInDays + ")");


        DayOfWeek birthdayDayOfWeek = dateOfBirth.getDayOfWeek();
        System.out.println("Day of the week I was born: " + birthdayDayOfWeek);

        LocalDate nextBDay = dateOfBirth.withYear(today.getYear());
        System.out.println("Next birthday date: " + nextBDay);
        System.out.println("This year birthday will be/was on: " + nextBDay.getDayOfWeek());

        if (nextBDay.isBefore(today) || nextBDay.isEqual(today)) {
            System.out.println("Your birthday has already past this year");
        } else {
            System.out.println("Your birthday will be this year");
        }
        System.out.println();


        LocalDateTime localDateTime = LocalDateTime.now();
        String localDateTimePattern = "dd.MM.yyyy, HH-mm-ss";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(localDateTimePattern);



        System.out.println("Current local date and time: " + localDateTime);
        System.out.println("Formatted current local date and time: " + formatter.format(localDateTime));

        ZoneId kiev = ZoneId.of("Europe/Kiev");
        ZoneId berlin = ZoneId.of("Europe/Berlin");
        ZonedDateTime kievDateTime = ZonedDateTime.of(localDateTime, kiev);
        ZonedDateTime berlinDateTime = kievDateTime.withZoneSameInstant(berlin);

        System.out.println("Current date and time in Kiev: " + formatter.format(kievDateTime));
        System.out.println("Current date and time in Berlin: " + formatter.format(berlinDateTime));

    }

}
