package com.brainacad.andreyaa.labs.jdbc;

import com.brainacad.andreyaa.labs.jdbc.dto.Product;
import com.brainacad.andreyaa.labs.jdbc.dto.Purchase;
import com.brainacad.andreyaa.labs.jdbc.dto.PurchaseItem;
import com.brainacad.andreyaa.labs.jdbc.dto.User;

class JDBCStore {

    public static void main(String[] args) {

        try {
            // TODO Подключение к БД

            // TODO создать Пользователя - new User

            // TODO создать несколько произвольных товаров - new Product

            // TODO создать Заказ - new Purchase

            // TODO создать несколько заказанных единиц  - new PurchaseItem

            // *TODO Получить все заказы и купленные товары пользователем.

            // TODO закрыть соединение
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

    private User insertUser(User user) {
        // TODO создать запрос на вставку в БД используя значения из объекта.
        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }

    private Product insertProduct(Product product) {
        // TODO создать запрос на вставку в БД используя значения из объекта.
        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }

    private Purchase insertPurchase(Purchase purchase) {
        // TODO создать запрос на вставку в БД используя значения из объекта.
        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }

    private PurchaseItem insertPurchaseItem(PurchaseItem purchaseItem) {
        // TODO создать запрос на вставку в БД используя значения из объекта.
        // TODO добавить обработку на получение ID, обновить его у объекта
        return null;
    }
}