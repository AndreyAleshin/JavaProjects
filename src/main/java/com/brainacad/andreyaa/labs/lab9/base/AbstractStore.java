package com.brainacad.andreyaa.labs.lab9.base;

import com.brainacad.andreyaa.labs.lab9.api.Storable;

import java.util.Arrays;

/**
 * Abstract class of any store.
 */
public abstract class AbstractStore implements Storable {

    private String storeName;
    private Product[] products;

    public AbstractStore(String storeName, Product[] products) {
        this.storeName = storeName;
        this.products = products;
    }

    @Override
    public void addNewProduct(Product product) {
        this.products = Arrays.copyOf(this.products, this.products.length+1);
        this.products[this.products.length-1] = product;

        // Execute abstract method which implemented in child classes.
        registerNewProduct(product);
    }

    @Override
    public Product[] getAllProducts() {
        return this.products;
    }

    /**
     * Each store has its own procedure for receiving and inventory of new products.
     * @param newProduct
     */
    protected abstract void registerNewProduct(Product newProduct);

    // GETTERS
    public String getStoreName() {
        return storeName;
    }

    public Product[] getProducts() {
        return products;
    }
}
