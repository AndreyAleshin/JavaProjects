package com.brainacad.andreyaa.labs.java_swing;

import javax.swing.*;
import java.awt.*;

public class BorderGridLayoutDemo extends JFrame {

    public BorderGridLayoutDemo() {

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(new JToggleButton("--1--"), BorderLayout.WEST);
        c.add(new JToggleButton("--2--"), BorderLayout.SOUTH);
        c.add(new JToggleButton("--3--"), BorderLayout.EAST);

        JPanel jPanel = new JPanel();
        c.add(jPanel, BorderLayout.NORTH);
        jPanel.setSize(164, 40);
        jPanel.setLayout(new GridLayout(2, 4));

        for (int i = 0; i < 7; i++) {
            jPanel.add(new JButton("" + i));
        }
    }

    public static void main(String[] args) {

        BorderGridLayoutDemo fr = new BorderGridLayoutDemo();

        fr.setSize(400, 200);
        fr.setTitle("Border & Grid Layouts example");
        fr.setDefaultCloseOperation(EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
