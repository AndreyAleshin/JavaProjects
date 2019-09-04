package com.github.andreyaleshin.HeadFirstJava.CyberBeatBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;

public class SimpleChatClient {

    private JTextArea incoming;
    private JTextField outgoing;
    private BufferedReader reader;
    private PrintWriter writer;
    private Socket socket;

    public static void main(String[] args) {
        SimpleChatClient client = new SimpleChatClient();
        client.go();
    }

    public void go() {

        JFrame frame = new JFrame("Ludicrously Simple Chat Client");
        JPanel mainPanel = new JPanel();

        incoming = new JTextArea(15, 50);
        incoming.setLineWrap(true);
        incoming.setWrapStyleWord(true);
        incoming.setEditable(false);

        JScrollPane qScroller = new JScrollPane(incoming);
        qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        outgoing = new JTextField(20);

        JButton sendButton = new JButton("Send");
        sendButton.addActionListener(new SendButtonListener());

        mainPanel.add(qScroller);
        mainPanel.add(outgoing);
        mainPanel.add(sendButton);

        setUpNetworking();

        /*
        Запускаем новый поток, используя вложенный класс в качестве Runnable (задачи). Работа потока
        заключается в чтении данных с сервера через сокет и выводе любых входящих сообщений в
        прокручиваемую текстовую область.
         */
        Thread readerThread = new Thread(new IncomingReader()); // Поток для считывания
        readerThread.start();

        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        frame.setSize(400, 500);
        frame.setVisible(true);

    }

    private void setUpNetworking() {

        try {

            /*
            Используем сокет для получения входящего и исходящего потоков. Исходящий поток уже
            задействован для отправки данных, но теперь к нему добавился входящий поток, поэтому
            наш объект Thread может получать сообщения от сервера.
             */
            socket = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(socket.getInputStream());

            reader = new BufferedReader(streamReader);
            writer = new PrintWriter(socket.getOutputStream());
            System.out.println("Networking established.");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public class SendButtonListener implements ActionListener {

        /*
        Когда пользователь нажимает кнопку Send, содержимое текстового поля отправляется
        на сервер.
         */
        public void actionPerformed(ActionEvent event) {

            try {
                writer.println(outgoing.getText());
                writer.flush();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            outgoing.setText("");
            outgoing.requestFocus();

        }

    }

    /*
    Это работа, которую выполняет поток! В методе run() поток входит в цикл (пока ответ сервера
    будет равняться null), считывает за раз одну строку и добавляет её в прокручиваемую текстовую
    область (используя в конце символ переноса строки).
     */
    public class IncomingReader implements Runnable {

        public void run() {

            String message;

            try {

                while ((message = reader.readLine()) != null) {
                    System.out.println("Read " + message);
                    incoming.append(message + "\n");
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }

    }

}
