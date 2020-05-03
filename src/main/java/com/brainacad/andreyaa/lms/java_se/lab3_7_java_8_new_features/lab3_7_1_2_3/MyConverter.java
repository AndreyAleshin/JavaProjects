package com.brainacad.andreyaa.lms.java_se.lab3_7_java_8_new_features.lab3_7_1_2_3;

@FunctionalInterface
interface MyConverter {

    String convertStr(String str);

    static boolean isNull(String str) {
        if (str.isEmpty()) {
            System.out.println("No string provided");
            return true;
        }
        return false;
    }

}
