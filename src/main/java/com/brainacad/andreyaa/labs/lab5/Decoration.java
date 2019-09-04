package com.brainacad.andreyaa.labs.lab5;

/**
 * A simple class to describe a set of decorations established in aquarium
 *
 * @author Andrey Aleshin
 */
public class Decoration {

    private String decorationType;

    public void stone() {}
    public void house() {}

    public String getDecorationType() {
        return decorationType;
    }
    public void setDecorationType(String decorationType) {
        this.decorationType = decorationType;
    }

}
