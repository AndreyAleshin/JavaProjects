package com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_5;

import java.time.DayOfWeek;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of trains you want to add: ");
        int numberOfTrains = sc.nextInt();

        TrainSchedule trainSchedule = new TrainSchedule(new TrainSchedule.Train[numberOfTrains]);

        trainSchedule.addTrain();
        trainSchedule.printTrains();
        System.out.println();
        trainSchedule.searchTrain("st1", DayOfWeek.SUNDAY);


    }

}
