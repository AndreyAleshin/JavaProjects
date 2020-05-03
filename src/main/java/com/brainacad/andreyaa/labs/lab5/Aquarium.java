package com.brainacad.andreyaa.labs.lab5;

/**
 * A simple class to describe an aquarium
 *
 * @author Andrey Aleshin
 */
class Aquarium {

    private int height;
    private int width;
    private int length;
    //private String type; морской или пресный
    private int temperature;


    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public double aquariumVolume() {
        // Volume of the aquarium in liters
        return (double) height * length * width / 1000;
    }

    public double waterVolume() {
        // При нашей высоте в 60 сантиметров, чуть менее 10% объема ёмкости припадает на 5-сантиметровые стяжки
        return aquariumVolume() - aquariumVolume() * 0.1;
    }

}
