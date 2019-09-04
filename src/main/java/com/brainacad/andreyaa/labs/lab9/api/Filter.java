package com.brainacad.andreyaa.labs.lab9.api;

import com.brainacad.andreyaa.labs.lab9.base.Product;

/**
 * Interface for filtering products by special features
 */
public interface Filter {

    /**
     * Filtering by price.
     * @param min from price
     * @param max to price
     * @return filtered products list.
     */
    Product[] filterByPrice(Double min, Double max);

    /**
     * Filtering by name.
     * @param name  pattern to search.
     * @return filtered products list.
     */
    Product[] filterByName(String name);
}
