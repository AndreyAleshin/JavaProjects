package com.brainacad.andreyaa.labs.lab9.api;

import com.brainacad.andreyaa.labs.lab9.base.Product;

/**
 * Interface for shopping
 */
public interface Purchaser {

    /**
     * Add products to buy bucket.
     * @param product products to bucket
     * @return all products in bucket.
     */
    Product[] addToBucket(Product ...product);

    /**
     * Start buy process.
     * @param product products to buy
     * @return true if purchase success.
     */
    boolean buy(Product ...product);

}
