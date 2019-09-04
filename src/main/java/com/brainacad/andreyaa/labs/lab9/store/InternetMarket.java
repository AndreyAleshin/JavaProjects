package com.brainacad.andreyaa.labs.lab9.store;

import com.brainacad.andreyaa.labs.lab9.api.Counseling;
import com.brainacad.andreyaa.labs.lab9.api.Filter;
import com.brainacad.andreyaa.labs.lab9.api.MessageSender;
import com.brainacad.andreyaa.labs.lab9.api.Purchaser;
import com.brainacad.andreyaa.labs.lab9.base.AbstractStore;
import com.brainacad.andreyaa.labs.lab9.base.Product;

import java.util.Arrays;

public class InternetMarket extends AbstractStore implements Filter, MessageSender, Counseling, Purchaser {

    private String url;
    private Product[] bucket = new Product[]{};

    public InternetMarket(String storeName, String url, Product[] products) {
        super(storeName, products);
        this.url = url;
    }

    @Override
    protected void registerNewProduct(Product newProduct) {
        System.out.println("New product \"" + newProduct.getName() + "\" was registered by manager!");
    }

    public String getUrl() {
        return url;
    }

    @Override
    public String askQuestion(String question) {
        System.out.println("Support manager answer your question: \"" + question + "\"");
        return "Some answer from support.";
    }

    @Override
    public Product[] filterByPrice(Double min, Double max) {
        return new Product[0]; // TODO implement
    }

    @Override
    public Product[] filterByName(String name) {
        return new Product[0]; // TODO implement
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Send message to comments chat: \"" + message + "\"");
    }

    @Override
    public Product[] addToBucket(Product ...product) {
        int index = this.bucket.length;
        this.bucket = Arrays.copyOf(this.bucket, this.bucket.length + product.length);
        for (int i = index; i < this.bucket.length; i++) {
            this.bucket[i] = product[i-index];
        }
        return this.bucket;
    }

    public boolean buy() {
        return buy(bucket);
    }

    @Override
    public boolean buy(Product... product) {

        System.out.println("Buy products: \"" + Arrays.toString(product) + "\"");
        return true;
    }

}
