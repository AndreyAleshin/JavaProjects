package com.brainacad.andreyaa.labs.lab5;

class Main {

    public static void main(String[] args) {

        Aquarium Aquarium = new Aquarium();
        Feeder Feeder = new Feeder();
        Filter Filter = new Filter();
        Fish Fish = new Fish();
        Lamp Lamp = new Lamp();
        Plant Plant = new Plant();
        Decoration Decoration = new Decoration();

        System.out.println("Aquarium\n");
        Aquarium.setHeight(60);
        Aquarium.setLength(80);
        Aquarium.setWidth(50);
        Aquarium.setTemperature(25);
        System.out.println("The parameters of our aquarium are: height - " + Aquarium.getHeight() + " cm, length - " +
                Aquarium.getLength() + " cm, width - " + Aquarium.getWidth() + " cm.");
        System.out.println("The volume of the whole aquarium is " + Aquarium.aquariumVolume() + " liters.");
        System.out.println("But the real volume of water in the aquarium is " + Aquarium.waterVolume() + " liters.");
        System.out.println("And the temperature of the water is " + Aquarium.getTemperature() + " degrees Celsius.");
        System.out.println();

        System.out.println("\nFeeder\n");
        Feeder.pourFeed();
        Feeder.setVolume(300);
        Feeder.setModel("\"Feeder \"Happy Fish\" ver. 2.0\"");
        System.out.println("Model of the feeder is " + Feeder.getModel() + " and its volume is " + Feeder.getVolume() + " grams.");
        System.out.println();

        System.out.println("\nFilter\n");
        Filter.cleanWater();
        Filter.setPower(8); // Power consumption is 8 Watts
        Filter.setPerformance(750); // Maximum flow rate is 750 l/hour
        System.out.println("Power consumption of the aqua filter is " + Filter.getPower() + " Watts.");
        System.out.println("Its maximum flow rate is " + Filter.getPerformance() + " l/hour.");
        System.out.println();

        System.out.println("\nFishes\n");
        Fish.swim();
        Fish.eat();


        System.out.println("\nLamp\n");
        Lamp.setLampType("daylight");
        Lamp.setLampType("night");
        Lamp.setPower(30); // Power of the LED lamp is 30 Watts
        System.out.println("123" + Lamp.getLampType());
        System.out.println();

        System.out.println("\nPlant\n");
        Plant.setHeight(20);
        Plant.setType("green seaweed");
        System.out.println("In the aquarium we have a " + Plant.getHeight() + " centimeter " + Plant.getType() + ".");
        System.out.println();

        System.out.println("\nDecoration\n");
        Decoration.stone();
        Decoration.house();
        Decoration.setDecorationType("House and stones");
        System.out.println("");
        System.out.println();

    }

}
