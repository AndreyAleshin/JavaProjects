package com.brainacad.andreyaa.lms.java_fundamentals.lab2_8_abstract_classes_and_interfaces.additional_practice;

class FootballPlayer implements Sportsman {

    private String name;
    private String sport = "football";

    public FootballPlayer(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSport() {
        return this.sport;
    }

}
