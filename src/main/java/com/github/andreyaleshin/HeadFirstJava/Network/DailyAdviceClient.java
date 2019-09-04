package com.github.andreyaleshin.HeadFirstJava.Network;

import java.io.*;
import java.net.*; // Здесь находится класс Socket

/**
 * Программа создаёт сокет и объект BufferedReader с помощью других потоков, а затем считывает
 * одну строку, которую ей передаёт серверное приложение, работающее на порту 4242.
 * Head First (c. 511).
 */
public class DailyAdviceClient {

    public void go() {

        try {

            /*
            Создаём соединение через сокет к приложению, работающему на порту 4242, на том же
            компьютере, где выполняется данный код (localhost).
             */
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());

            /*
            Подключаем BufferedReader к InputStreamReader (который уже соединён с исходящим
            потоком сокета).
             */
            BufferedReader reader = new BufferedReader(streamReader);

            /*
            Метод readLine() работает точно так же, как если бы BufferedReader был подключён
            к файлу. Иными словами, работая с методом из BufferedReader, вы не знаете (или вам
            всё равно), откуда пришли символы.
             */
            String advice = reader.readLine();
            System.out.println("Сегодня ты должен: " + advice);

            reader.close(); // Закрываются все потоки

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }

}
