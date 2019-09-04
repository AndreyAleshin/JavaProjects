package com.brainacad.andreyaa.labs.lab9.api;

import com.brainacad.andreyaa.labs.lab9.base.Product;

/**
 * Basic interface for store some products.
 */
public interface Storable {

    /**
     * Add product to main list.
     * @param product
     */
    void addNewProduct(Product product);

    /**
     * Get full products list.
     * @return Return full products list.
     */
    Product[] getAllProducts();
}
