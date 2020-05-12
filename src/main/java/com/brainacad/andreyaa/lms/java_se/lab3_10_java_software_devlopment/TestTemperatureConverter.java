package com.brainacad.andreyaa.lms.java_se.lab3_10_java_software_devlopment;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestTemperatureConverter {

    static TemperatureConverter converter;

    @BeforeClass
    public static void initialize() {
        converter = new TemperatureConverter();
    }

    @Test
    public void convertFtoC() {
        double result = converter.convertFtoC(32);
        Assert.assertEquals(0.0, result, 1e-9); // 1e-9 = 0.000...001
    }

    @Test
    public void convertCtoF() {
        double result = converter.convertCtoF(0);
        Assert.assertEquals(32.0, result, 1e-9);
    }

    @Test
    public void convertCtoK() {
        double result = converter.convertCtoK(0);
        Assert.assertEquals(273.2, result, 1e-9);
    }

    @Test
    public void convertKtoC() {
        double result = converter.convertKtoC(273.2);
        Assert.assertEquals(0.0, result, 1e-9);
    }

    @Test
    public void convertFtoK() {
        double result = converter.convertFtoK(-459.7);
        Assert.assertEquals(0.0, result, 1e-9);
    }

    @Test
    public void convertKtoF() {
        double result = converter.convertKtoF(0.0);
        Assert.assertEquals(-459.7, result, 1e-9);
    }

}
