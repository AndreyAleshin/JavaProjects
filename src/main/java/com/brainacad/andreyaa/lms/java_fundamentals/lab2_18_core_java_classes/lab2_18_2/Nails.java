package com.brainacad.andreyaa.lms.java_fundamentals.lab2_18_core_java_classes.lab2_18_2;

import java.math.BigDecimal;

class Nails {

    static void countNails() {

        BigDecimal money = new BigDecimal("1.0");
        BigDecimal nail = new BigDecimal("0.1");
        int count = 0;

        for (BigDecimal i = nail; i.compareTo(money) < 0; nail = nail.add(i)) {
            money = money.subtract(nail);
            count++;
        }

        System.out.println(count + " item(s) bought");
        System.out.println(money + "$ surrender");

    }

    public static void main(String[] args) {

        countNails();

    }

}
