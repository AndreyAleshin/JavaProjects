package com.brainacad.andreyaa.labs.lab6;

import com.brainacad.andreyaa.labs.lab6.api.CurrencyBoard;
import com.brainacad.andreyaa.labs.lab6.api.CurrencyConvertor;

import static com.brainacad.andreyaa.labs.lab6.NBU.*;

public class PrivatBank implements CurrencyConvertor, CurrencyBoard {

    public static double USD_CURRENCY_RATIO = 1.05;
    public static double EUR_CURRENCY_RATIO = 1.08;

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

    @Override
    public void displayUSD() {
        double buyUsd = UAH_TO_USD_OFFICIAL / USD_CURRENCY_RATIO;
        double saleUsd = USD_TO_UAH_OFFICIAL * USD_CURRENCY_RATIO;
        System.out.printf("PrivatBank USD: buy = %f, sale = %f", buyUsd, saleUsd);
        System.out.println();
    }

    @Override
    public void displayEUR() {
        double buyEur = UAH_TO_EUR_OFFICIAL / EUR_CURRENCY_RATIO;
        double saleEur = EUR_TO_UAH_OFFICIAL * EUR_CURRENCY_RATIO;
        System.out.printf("PrivatBank EUR: buy = %f, sale = %f", buyEur, saleEur);
        System.out.println();
    }
}