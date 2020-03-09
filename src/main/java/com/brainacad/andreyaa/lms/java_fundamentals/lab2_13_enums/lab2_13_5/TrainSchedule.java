package com.brainacad.andreyaa.lms.java_fundamentals.lab2_13_enums.lab2_13_5;

import java.time.DayOfWeek;
import java.util.Scanner;

class TrainSchedule {

    private Train[] trains;

    TrainSchedule(Train[] trains) {
        this.trains = trains;
    }

    void addTrain() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < trains.length; i++) {
            trains[i] = new Train();

            System.out.print("Enter a train number: ");
            int number = sc.nextInt();
            trains[i].setNumber(number);

            System.out.print("Enter station of dispatch: ");
            String stationDispatch = sc.next();
            trains[i].setStationDispatch(stationDispatch);

            System.out.print("Enter station of arrival: ");
            String stationArrival = sc.next();
            trains[i].setStationArrival(stationArrival);

            System.out.print("Enter time of dispatch: ");
            String timeDispatch = sc.next();
            trains[i].setTimeDispatch(timeDispatch);

            System.out.print("Enter time of arrival: ");
            String timeArrival = sc.next();
            trains[i].setTimeArrival(timeArrival);

            System.out.print("Enter a day of dispatch: ");
            try {
                DayOfWeek dayOfDispatch = DayOfWeek.valueOf(sc.next().toUpperCase());
                trains[i].setDayOfDispatch(dayOfDispatch);
            } catch (IllegalArgumentException e) {
                System.out.println("Please type correct day of the week");
            }

            System.out.println();
        }

        sc.close();

    }

    void printTrains() {
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }

    // Need to implement equals() method in Train class
//    Train searchTrain(TrainSchedule trainSchedule, String stationDispatch, DayOfWeek day) {
//        if (trainSchedule..equals(stationDispatch) && day.equals(day)) {
//            return new Train();
//        }
//        return null;
//    }


    class Train {

        private int number;
        private String stationDispatch;
        private String stationArrival;
        private String timeDispatch;
        private String timeArrival;
        private DayOfWeek dayOfDispatch;

//        Train(int number) {
//            this.number = number;
//        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        String getStationDispatch() {
            return stationDispatch;
        }

        void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        String getStationArrival() {
            return stationArrival;
        }

        void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        String getTimeDispatch() {
            return timeDispatch;
        }

        void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        String getTimeArrival() {
            return timeArrival;
        }

        void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        DayOfWeek getDayOfDispatch() {
            return dayOfDispatch;
        }

        void setDayOfDispatch(DayOfWeek dayOfDispatch) {
            this.dayOfDispatch = dayOfDispatch;
        }

        @Override
        public String toString() {
            return "Train NUMBER: " + number +
                    ", station of dispatch: " + stationDispatch +
                    ", station of arrival: " + stationArrival +
                    ", time of dispatch: " + timeDispatch +
                    ", time of arrival: " + timeArrival +
                    ", day of dispatch: " + dayOfDispatch;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Train train = (Train) o;

            if (stationDispatch != null ? !stationDispatch.equals(train.stationDispatch) : train.stationDispatch != null)
                return false;
            return dayOfDispatch == train.dayOfDispatch;
        }

        @Override
        public int hashCode() {
            int result = stationDispatch != null ? stationDispatch.hashCode() : 0;
            result = 31 * result + (dayOfDispatch != null ? dayOfDispatch.hashCode() : 0);
            return result;
        }

    }


}
