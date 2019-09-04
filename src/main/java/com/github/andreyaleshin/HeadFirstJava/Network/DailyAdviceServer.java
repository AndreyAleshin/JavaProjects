package com.github.andreyaleshin.HeadFirstJava.Network;

import java.io.*;
import java.net.*;

/**
 * Программа создаёт ServerSocket и ожидает клиентские запросы. При получении такого запроса (когда
 * клиент выполнил для этого приложения new Socket()) сервер создаёт объект Socket и устанавливает
 * соединение с этим клиентом. Сервер создаёт экземпляр PrintWriter (с помощью исходящего потока из
 * сокета) и отправляет клиенту сообщение.
 */
public class DailyAdviceServer {

    // Ежедневные советы берутся из этого массива
    String[] adviceList = {"Ешьте меньшими порциями", "Купите облегающие джинсы. Нет, они не делают " +
            "вас полнее.", "Два слова: не годится", "Будьте честны хотя бы сегодня. Скажите своему " +
            "начальнику всё, что вы *на самом деле* о нём думаете.", "Возможно, вам стоит подобрать " +
            "другую причёску."};

    public void go() {

        try {

            /*
            Благодаря ServerSocket приложение отслеживает клиентские запросы на порту 4242 на том же
            компьютере, где выполняется данный код.
             */
            ServerSocket serverSocket = new ServerSocket(4242);

            // Сервер входит в постоянный цикл, ожидая клиентских подключений (и обслуживая их)
            while (true) {

                /*
                Метод accept() блокирует приложение до тех пор, пока не поступит запрос, после чего
                возвращает сокет (на анонимном порту) для взаимодействия с клиентом.
                 */
                Socket socket = serverSocket.accept();

                /*
                Теперь мы используем соединение объекта Socket с клиентом для создания экземпляра
                PrintWriter, после чего отправляем с его помощью (println()) строку с советом. Затем
                мы закрывем сокет, т.к. работа с клиентос закончена.
                 */
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();

                System.out.println(advice);

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

}
