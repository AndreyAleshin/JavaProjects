package com.brainacad.andreyaa.lms.java_fundamentals.lab2_8_abstract_classes_and_interfaces.additional_practice;

public class Main {

    public static void main(String[] args) {

        // Additional Task №1
        Sportsman[] footballPlayers = {new FootballPlayer("Dima"),
                new FootballPlayer("Vasya"),
                new FootballPlayer("Oleg"),
                new FootballPlayer("Andrey"),
                new FootballPlayer("Vanya")};

        for (Sportsman footballPlayer : footballPlayers) {
            System.out.println("I am " + footballPlayer.getName() + " and I play " + footballPlayer.getSport());
        }
        System.out.println();

        // Additional Task №2
        Sportsman[] chessPlayers = {new ChessPlayer("Fedor"),
                new ChessPlayer("Igor"),
                new ChessPlayer("Petr"),
                new ChessPlayer("Sergey"),
                new ChessPlayer("Aleksandr")};

        for (Sportsman chessPlayer : chessPlayers) {
            System.out.println("I am " + chessPlayer.getName() + " and I play " + chessPlayer.getSport());
        }
        System.out.println();

        // Additional Task №3
        Sportsman[] formula1Pilots = {new Formula1Pilot("Sebastian"),
                new Formula1Pilot("Danya"),
                new Formula1Pilot("Lewis"),
                new Formula1Pilot("Max"),
                new Formula1Pilot("Charles")};

        for (Sportsman formula1Pilot : formula1Pilots) {
            System.out.println("I am " + formula1Pilot.getName() + " and I love " + formula1Pilot.getSport());
        }
        System.out.println();

        // Additional Task №4
        FootballPlayer footballPlayer1 = new FootballPlayer("Kolya");
        FootballPlayer footballPlayer2 = new FootballPlayer("Vasya");
        FootballPlayer footballPlayer3 = new FootballPlayer("Dima");
        FootballPlayer footballPlayer4 = new FootballPlayer("Andrey");
        FootballPlayer footballPlayer5 = new FootballPlayer("Oleg");
        FootballPlayer footballPlayer6 = new FootballPlayer("Sergey");
        FootballPlayer footballPlayer7 = new FootballPlayer("Tolya");
        FootballPlayer footballPlayer8 = new FootballPlayer("Leonid");
        FootballPlayer footballPlayer9 = new FootballPlayer("Vova");
        FootballPlayer footballPlayer10 = new FootballPlayer("Petya");
        FootballPlayer footballPlayer11 = new FootballPlayer("Sanya");

        FootballTeam footballTeam = new FootballTeam(new FootballPlayer[]{footballPlayer1, footballPlayer2,
                footballPlayer3, footballPlayer4, footballPlayer5, footballPlayer6,
                footballPlayer7, footballPlayer8, footballPlayer9, footballPlayer10,
                footballPlayer11});

        for (int i = 0; i < footballTeam.getSportsmen().length; i++) {
            System.out.println(footballTeam.getSportsmen()[i].getName());
        }
        System.out.println();

        // Additional Task №5
        ChessPlayer chessPlayer1 = new ChessPlayer("Kolya");
        ChessPlayer chessPlayer2 = new ChessPlayer("Vasya");
        ChessPlayer chessPlayer3 = new ChessPlayer("Dima");

        ChessPlayer chessPlayer4 = new ChessPlayer("Andrey");
        ChessPlayer chessPlayer5 = new ChessPlayer("Oleg");
        ChessPlayer chessPlayer6 = new ChessPlayer("Sergey");

        ChessPlayer chessPlayer7 = new ChessPlayer("Tolya");
        ChessPlayer chessPlayer8 = new ChessPlayer("Leonid");
        ChessPlayer chessPlayer9 = new ChessPlayer("Vova");

        ChessTeam chessTeam1 = new ChessTeam(new ChessPlayer[]{chessPlayer1, chessPlayer2, chessPlayer3});
        ChessTeam chessTeam2 = new ChessTeam(new ChessPlayer[]{chessPlayer4, chessPlayer5, chessPlayer6});
        ChessTeam chessTeam3 = new ChessTeam(new ChessPlayer[]{chessPlayer7, chessPlayer8, chessPlayer9});

        for (int i = 0; i < chessTeam1.getSportsmen().length; i++) {
            System.out.println("My name is " + chessTeam1.getSportsmen()[i].getName() +
            " and I play chess");
        }
        for (int i = 0; i < chessTeam2.getSportsmen().length; i++) {
            System.out.println("My name is " + chessTeam2.getSportsmen()[i].getName() +
                    " and I play chess");
        }
        for (int i = 0; i < chessTeam3.getSportsmen().length; i++) {
            System.out.println("My name is " + chessTeam3.getSportsmen()[i].getName() +
                    " and I play chess");
        }
        System.out.println();

        // Additional Task №6
        Formula1Pilot formula1Pilot1 = new Formula1Pilot("Sebastian");
        Formula1Pilot formula1Pilot2 = new Formula1Pilot("Charles");
        Formula1Pilot formula1Pilot3 = new Formula1Pilot("Esteban");

        Formula1Pilot formula1Pilot4 = new Formula1Pilot("Lewis");
        Formula1Pilot formula1Pilot5 = new Formula1Pilot("Valtteri");
        Formula1Pilot formula1Pilot6 = new Formula1Pilot("George");

        Formula1Pilot formula1Pilot7 = new Formula1Pilot("Max");
        Formula1Pilot formula1Pilot8 = new Formula1Pilot("Alexander");
        Formula1Pilot formula1Pilot9 = new Formula1Pilot("James");

        Formula1Pilot formula1Pilot10 = new Formula1Pilot("Carlos");
        Formula1Pilot formula1Pilot11 = new Formula1Pilot("Lando");
        Formula1Pilot formula1Pilot12 = new Formula1Pilot("Fernando");

        Formula1Pilot formula1Pilot13 = new Formula1Pilot("Daniel");
        Formula1Pilot formula1Pilot14 = new Formula1Pilot("Niko");
        Formula1Pilot formula1Pilot15 = new Formula1Pilot("John");

        Formula1Team formula1Team1 = new Formula1Team(new Formula1Pilot[]{formula1Pilot1,
                formula1Pilot2, formula1Pilot3});
        Formula1Team formula1Team2 = new Formula1Team(new Formula1Pilot[]{formula1Pilot4,
                formula1Pilot5, formula1Pilot6});
        Formula1Team formula1Team3 = new Formula1Team(new Formula1Pilot[]{formula1Pilot7,
                formula1Pilot8, formula1Pilot9});
        Formula1Team formula1Team4 = new Formula1Team(new Formula1Pilot[]{formula1Pilot10,
                formula1Pilot11, formula1Pilot12});
        Formula1Team formula1Team5 = new Formula1Team(new Formula1Pilot[]{formula1Pilot13,
                formula1Pilot14, formula1Pilot15});

        for (int i = 0; i < formula1Team1.getSportsmen().length; i++) {
            System.out.println("My name is " + formula1Team1.getSportsmen()[i].getName() +
                    " and I love racing");
        }
        for (int i = 0; i < formula1Team2.getSportsmen().length; i++) {
            System.out.println("My name is " + formula1Team2.getSportsmen()[i].getName() +
                    " and I love racing");
        }
        for (int i = 0; i < formula1Team3.getSportsmen().length; i++) {
            System.out.println("My name is " + formula1Team3.getSportsmen()[i].getName() +
                    " and I love racing");
        }
        for (int i = 0; i < formula1Team4.getSportsmen().length; i++) {
            System.out.println("My name is " + formula1Team4.getSportsmen()[i].getName() +
                    " and I love racing");
        }
        for (int i = 0; i < formula1Team5.getSportsmen().length; i++) {
            System.out.println("My name is " + formula1Team5.getSportsmen()[i].getName() +
                    " and I love racing");
        }

    }

}
