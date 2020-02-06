package com.brainacad.andreyaa.lms.java_fundamentals.lab2_8_abstract_classes_and_interfaces.additional_practice;

class FootballTeam implements Team {

    private FootballPlayer[] team;

    public FootballTeam(FootballPlayer[] team) {
        this.team = team;
    }

    @Override
    public Sportsman[] getSportsmen() {
        return this.team;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getSport() {
        return null;
    }

}
