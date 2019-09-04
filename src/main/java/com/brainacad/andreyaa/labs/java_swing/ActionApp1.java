package com.brainacad.andreyaa.labs.java_swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ActionApp1 extends JFrame {

    private JButton button;
    private JPanel panel = new JPanel(); // рабочая панель (блок)

    public ActionApp1(String title) {

        super(title);
        this.setSize(300, 100); // размер окна (пикселей)
        this.setLocation(300, 300); // позиция окна ((0;0) точка, находится в верхнем левом краю окна)

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // завершение работы приложения при закрытии

        JLabel label = new JLabel("Test label"); // простой текст
        panel.add(label); // добавляем текст в панель

        button = new JButton("Open calculator"); // кнопка с названием
        button.addActionListener(new ActionListener() { // обработка события нажатия на кнопку
            @Override
            public void actionPerformed(ActionEvent e) { // метод, который срабатывает по нажатию кнопки
                try {
                    Process process = Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        });

        panel.add(button); // обавление кнопи на панель
        this.add(panel); // добавление панели (со всеми элементами) в окно приложения
        this.setVisible(true); // флаг отображения окна
    }

    public static void main(String[] args) {

        new ActionApp1("Action application №1");

    }
}
