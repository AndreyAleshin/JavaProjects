package com.brainacad.andreyaa.labs.java_swing;

import javax.swing.*;

public class ActionApp2 extends JFrame {

    private JButton button;
    private JPanel panel = new JPanel(); // рабочая панель (блок)
    private JComboBox list;

    public ActionApp2(String title) {

        super(title);
        this.setSize(400, 100); // размер окна
        this.setLocation(200, 200); // позиция окна
        String[] programs = {"Select 1", "Select 2"}; // массив возможных значений селектора
        list = new JComboBox(programs); // создание селектора
        panel.add(list); // добавление селектора на панель
        button = new JButton("Test");
        button.addActionListener(e -> { // пример лямбда-выражения
            String prog = (String) list.getSelectedItem(); // получение выбранного элемента селектора
            switch (prog) {
                case "Select 1":
                    System.out.println("Select 1 was executed!");
                    break;
                case "Select 2":
                    System.out.println("Select 2 was executed!");
                    break;
            }
        });
        panel.add(button);
        this.add(panel); // добавление панели со всеми элементами в окно прилодения
        this.setVisible(true); // флаг отображения окна
    }

    public static void main(String[] args) {

        new ActionApp2("Action application №2");
    }
}
