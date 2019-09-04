package com.brainacad.andreyaa.labs.lab9;

import com.brainacad.andreyaa.labs.lab9.base.Product;
import com.brainacad.andreyaa.labs.lab9.store.InternetMarket;

public class Lab9Test {

    public static void main(String[] args) {

        // TODO debug this!
        Product[] initialProducts = {
                new Product("USB flash",100.0),
                new Product("LG tv55",40_000.0),
                new Product("iPad",12_000.0),
                new Product("Sony PS4 PRO",11_100.0)
        };
        InternetMarket rozetka = new InternetMarket("ROZETKA","www.rozetka.ua",initialProducts);
        rozetka.addNewProduct(new Product("Marshal CODE 50",9_000.0));
        Product[] filteredProducts1 = rozetka.filterByPrice( 1000.0, 15000.0);
        Product[] filteredProducts2 = rozetka.filterByName("PS4");

        rozetka.addToBucket(initialProducts[2], initialProducts[3]);
        rozetka.buy();
    }
}
