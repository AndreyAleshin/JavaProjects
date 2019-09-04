package com.brainacad.andreyaa.labs.jdbc;

import com.brainacad.andreyaa.labs.jdbc.dto.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class JDBCInsert {

    public static void main(String[] args) {

        try {

            // Подключение к БД
            JDBCConnector app = new JDBCConnector();
            Connection conn = app.connect();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Подготовка SQL запроса, на вставку продукта
            PreparedStatement productStatement
                    = conn.prepareStatement("INSERT INTO store.products " +
                    "VALUES (DEFAULT,'Пароварка', 1000, ?,?)",
                    Statement.RETURN_GENERATED_KEYS); // указываем возвращение сгенерированного ID

            // Создание значения для колонки с датой
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            productStatement.setTimestamp(1, timestamp);

            // Создание значения для колонки с массивом
            Array tags = conn.createArrayOf("varchar", new Object[]{"Кухня", "Бытовая техника"});
            productStatement.setArray(2, tags);

            // Выполнение
            productStatement.executeUpdate();

            // Обработка ответа, считываем созданный ID
            try (ResultSet generatedKeys = productStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    System.out.println(generatedKeys.getInt(1));
            }
                else {
                    throw new SQLException("User creation has failed, no ID obtained.");
                }
            }

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Подготовка SQL запроса, на вставку пользователя
            PreparedStatement user
                    = conn.prepareStatement("INSERT INTO store.users " +
                    "VALUES (DEFAULT,'abc@gml.com', 'qwerty', 'Запорожье, пр.Ленина 22', ?)");
            user.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            user.executeUpdate();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Подготовка SQL запроса, на вставку заказа
            PreparedStatement purchase
                    = conn.prepareStatement("INSERT INTO store.purchases " +
                    "VALUES (DEFAULT, ?, '#123456', 'Запорожье, пр.Ленина 23', 123, 15)");
            purchase.setTimestamp(1, new Timestamp(System.currentTimeMillis()));
            purchase.executeUpdate();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Подготовка SQL запроса, на вставку заказанного товара
            PreparedStatement purchaseItem1
                    = conn.prepareStatement("INSERT INTO store.purchase_items " +
                    "VALUES (DEFAULT, 16, 1, 1460, 2, 'Отправлено')");
            purchaseItem1.executeUpdate();

            ////////////////////////////////////////////////////////////////////////////////////////////////////////////

            // Получение всех значений товаров из таблицы
            ResultSet result = conn.createStatement().executeQuery("SELECT id, title, price, created_at, tags " +
                    "  FROM store.products;");

            // Список для сформированного результата
            List<Product> selectProducts = new ArrayList<>();

            // Цикл по всем рзультатам запроса
            while (result.next()) {
                // Переводим результаты значений колонок в объект
                Product p = new Product();
                p.setId(result.getInt(1)); // получение по номеру колонки
                p.setTitle(result.getString("title")); // получение по имени колонки
                p.setPrice(result.getInt("price"));
                p.setCreateAt(result.getDate("created_at"));

                Array tagValues = result.getArray("tags"); // получаем массив
                p.setTags(Arrays.asList((String[]) tagValues.getArray())); // конвертируем массив в список

                selectProducts.add(p);
            }
            conn.close();
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }

    }

}