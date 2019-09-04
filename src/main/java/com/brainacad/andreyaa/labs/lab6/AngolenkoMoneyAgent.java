package com.brainacad.andreyaa.labs.lab6;

import com.brainacad.andreyaa.labs.lab6.api.CurrencyConvertor;

import static com.brainacad.andreyaa.labs.lab6.NBU.*;

public class AngolenkoMoneyAgent implements CurrencyConvertor {

    public static double USD_CURRENCY_RATIO = 1.03;
    public static double EUR_CURRENCY_RATIO = 1.05;

    @Override
    public double convertUAHToUSD(double value) {
        return value / UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUSDtoUAH(double value) {
        return value * USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
    }

    @Override
    public double convertUAHToEUR(double value) {
        return value / UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
    }

    @Override
    public double convertEURtoUAH(double value) {
        return value * EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
    }

    public void askExchangeRates(String currency) {
        switch (currency) {
            case "USD":
                System.out.println("I can exchange 10 dollars for " + convertUSDtoUAH(10) + " hrn.\n" + "Or I can exchange 1000 hrivnas for " + convertUAHToUSD(1000));
                System.out.println();
                break;
            case "EUR":
                System.out.println("I can exchange 10 euros for " + convertEURtoUAH(10) + " hrn.\n" + "Or I can exchange 1000 hrivnas for " + convertUAHToEUR(1000));
                System.out.println();
                break;
            default:
                System.out.println("If you want I can exchange rubles");
                System.out.println();
                break;
        }
    }
}
