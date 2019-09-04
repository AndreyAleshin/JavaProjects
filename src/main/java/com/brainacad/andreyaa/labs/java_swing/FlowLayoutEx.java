package com.brainacad.andreyaa.labs.java_swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JApplet {

    private Component c[] = new Component[9];

    public void init() {

        String[] msg = {"Метка 1", "Метка 2", "Метка 3"};
        String[] str = {"Кнопка 1", "Кнопка 2", "Кнопка 3"};
        String[] txt = {"Текст 1", "Текст 2", "Текст 3"};

        // Установка менеджера размещений
        setLayout(new FlowLayout());
        setBackground(Color.gray);
        setForeground(Color.getHSBColor(1f, 1f, 1f));

        for (int i = 0; i < c.length / 3; i++) {
            c[i] = new JButton(str[i]);
            add(c[i]);
            c[i + 3] = new JLabel(msg[i]);
            add(c[i + 3]);
            c[i + 6] = new JTextField(txt[i]);
            add(c[i + 6]);
        }
        setSize(450, 150);
    }

    public static void main(String[] args) {

        FlowLayoutEx fl = new FlowLayoutEx();
        fl.setSize(400, 200);
        fl.setVisible(true);
    }
}
