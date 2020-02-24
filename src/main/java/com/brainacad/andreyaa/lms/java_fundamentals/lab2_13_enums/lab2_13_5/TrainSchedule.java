package com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_5;

import com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_1_2_3.MyDayOfTheWeek;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.Scanner;

class TrainSchedule {

    private Train[] trains;

    public TrainSchedule(Train[] trains) {
        this.trains = trains;
    }

    void addTrain() {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String stationDispatch = scanner.nextLine();
        String stationArrival = scanner.nextLine();
        String timeDispatch = scanner.nextLine();
        String timeArrival = scanner.nextLine();


    }


    class Train {

        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private MyDayOfTheWeek[] days;
        private DayOfWeek day;

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public MyDayOfTheWeek[] getDays() {
            return days;
        }

        public void setDays(MyDayOfTheWeek[] days) {
            this.days = days;
        }

        @Override
        public String toString() {
            return "Train number: " + number +
                    ", station of dispatch: " + stationDispatch +
                    ", station of arrival: " + stationArrival +
                    ", time of dispatch: " + timeDispatch +
                    ", time of arrival: " + timeArrival +
                    ", day: " + Arrays.toString(days);
        }

    }


}
