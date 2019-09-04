package com.brainacad.andreyaa.labs.lab6;

import static com.brainacad.andreyaa.labs.lab6.NBU.*;

public class Lab6Test {

    public static void main(String[] args) {

        PrivatBank PrivatBank1 = new PrivatBank();
        PrivatBank PrivatBank2 = new PrivatBank();

        Demos Demos1 = new Demos();
        Demos Demos2 = new Demos();

        AngolenkoMoneyAgent MoneyAgent1 = new AngolenkoMoneyAgent();
        AngolenkoMoneyAgent MoneyAgent2 = new AngolenkoMoneyAgent();

        System.out.println("NBU currency rates");
        System.out.println("USD rate to UAH: " + USD_TO_UAH_OFFICIAL);
        System.out.println("UAH rate to USD: " + UAH_TO_USD_OFFICIAL);
        System.out.println("EUR rate to UAH: " + EUR_TO_UAH_OFFICIAL);
        System.out.println("UAH rate to EUR: " + UAH_TO_EUR_OFFICIAL);
        System.out.println();

        System.out.println("PrivatBank currency rates");
        PrivatBank1.displayUSD();
        PrivatBank1.displayEUR();
        System.out.println();

        System.out.println("Demos currency rates");
        Demos1.displayUSD();
        Demos1.displayEUR();
        System.out.println();

        System.out.println("Ask Angolenko Money Agent for currency rates");
        //MoneyAgent1.askExchangeRates("USD");
        MoneyAgent1.askExchangeRates("EUR");
        //MoneyAgent1.askExchangeRates("Do you have any other currencies for exchange?");

        System.out.println("Exchange 100 USD and EUR to UAH and 1000 UAH to USD and EUR");
        System.out.println("USD to UAH: " + PrivatBank1.convertUSDtoUAH(100));
        System.out.println("UAH to USD: " + PrivatBank1.convertUAHToUSD(1000));
        System.out.println("EUR to UAH: " + PrivatBank1.convertEURtoUAH(100));
        System.out.println("UAH to EUR: " + PrivatBank1.convertUAHToEUR(1000));
        System.out.println();


        System.out.println("\nUAH cheapened by 5%\n");
        NBU.cheapeningUAH(5);

        System.out.println("NBU currency rates after cheapening of the UAH");
        System.out.println("USD to UAH: " + USD_TO_UAH_OFFICIAL);
        System.out.println("UAH to USD: " + UAH_TO_USD_OFFICIAL);
        System.out.println("EUR to UAH: " + EUR_TO_UAH_OFFICIAL);
        System.out.println("UAH to EUR: " + UAH_TO_EUR_OFFICIAL);
        System.out.println();

        System.out.println("PrivatBank currency rates after cheapening of the UAH");
        PrivatBank2.displayUSD();
        PrivatBank2.displayEUR();
        System.out.println();

        System.out.println("Demos currency rates after cheapening of the UAH");
        Demos2.displayUSD();
        Demos2.displayEUR();
        System.out.println();

        System.out.println("Ask Angolenko Money Agent for currency rates (after cheapening of the UAH)");
        //MoneyAgent2.askExchangeRates("USD");
        //MoneyAgent2.askExchangeRates("EUR");
        MoneyAgent2.askExchangeRates("Do you have any other currencies for exchange?");

        System.out.println("Exchange 100 USD and EUR to UAH and 1000 UAH to USD and EUR");
        System.out.println("USD to UAH: " + PrivatBank2.convertUSDtoUAH(100));
        System.out.println("UAH to USD: " + PrivatBank2.convertUAHToUSD(1000));
        System.out.println("EUR to UAH: " + PrivatBank2.convertEURtoUAH(100));
        System.out.println("UAH to EUR: " + PrivatBank2.convertUAHToEUR(1000));
        System.out.println();
    }
}
