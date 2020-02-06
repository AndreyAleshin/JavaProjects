package com.brainacad.andreyaa.lms.java_fundamentals.lab1_5_control_flow_statements;

public class lab1_5_1 {
    public static void main(String[] args) {

//        for (int i = 1; i <= 8; i++) {
//            for (int j = 1; j < 8 - i; j++) {
//                System.out.print(""); // Можно сдвигать вершину ставя пробелы
//            }
//            for (int j = i; j > 0; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 8; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
