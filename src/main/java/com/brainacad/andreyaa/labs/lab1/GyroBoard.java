package com.brainacad.andreyaa.labs.lab1;

/**
 * Gyro-board can also be considered as transport :)
 *
 */
public class GyroBoard extends Transport
{
    public GyroBoard(final TransportType type, final String name)
    {
        super(type, name);
    }

    @Override
    public void startEngine() {
        System.out.println("Просто наклоняемся вперед)");
    }

    public static void main(String[] args)
    {
        Transport gyroboard = new GyroBoard(TransportType.ELECTRO, "JETROLL CROSS COUNTRY 9");
        gyroboard.setMaxSpeed(20);
        gyroboard.setPower(0.2f);

        // do some actions.
        gyroboard.run();
        gyroboard.stop();

        System.out.println("Gyro-board has power:" + gyroboard.convertPower() + " hp");
        System.out.printf("value = %2f", 1.3d);
    }
}
