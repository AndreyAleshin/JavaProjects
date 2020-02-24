package com.brainacad.andreyaa.misc;

public class HelpClassDemo {
    public static void main(String[] args) throws java.io.IOException {

        char choice, ignore;
        Help hlpObj = new Help();

        for (; ; ) {

            do {
                hlpObj.showMenu();
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');

            } while (!hlpObj.isValid(choice));

            if (choice == 'q') break;

            System.out.println("\n");

            hlpObj.helpOn(choice);

        }

    }

}
