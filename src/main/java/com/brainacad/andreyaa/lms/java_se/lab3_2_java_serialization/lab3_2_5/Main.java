package com.brainacad.andreyaa.lms.java_se.lab3_2_java_serialization.lab3_2_5;

import java.io.*;

class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String filePath = "D:\\AAA\\userfile.ser";

        UserExternalize[] users = new UserExternalize[3];

        users[0] = new UserExternalize("Bob", "Moon", 45);
        users[1] = new UserExternalize("Bob", "Boom", 35);
        users[2] = new UserExternalize("Bob", "Zoom", 25);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeObject(users[0]);
        oos.writeObject(users[1]);
        oos.writeObject(users[2]);
        oos.close();

        System.out.println("Serialization complete!\n");


        System.out.println("Starting deserialization: ");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath));

        UserExternalize user1 = (UserExternalize) ois.readObject();
        UserExternalize user2 = (UserExternalize) ois.readObject();
        UserExternalize user3 = (UserExternalize) ois.readObject();

        ois.close();

        System.out.println(user1);
        System.out.println();

        System.out.println(user2);
        System.out.println();

        System.out.println(user3);


    }

}
