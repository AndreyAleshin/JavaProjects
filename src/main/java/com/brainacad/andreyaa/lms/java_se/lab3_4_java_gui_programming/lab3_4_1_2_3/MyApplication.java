package com.brainacad.andreyaa.lms.java_se.lab3_4_java_gui_programming.lab3_4_1_2_3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

class MyApplication extends JFrame {

    private JButton button;
    private JPanel panel = new JPanel();
    private JComboBox list;

    MyApplication(String title) {

        setTitle(title);
        setSize(400, 150);
        setLocation(50, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Choose a program to run ->");
        panel.add(label);

        String[] programs = {"Calculator", "Notepad"};
        list = new JComboBox(programs);
        panel.add(list);

        button = new JButton("Run");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String listItem = (String) list.getSelectedItem();

                switch (listItem) {
                    case "Calculator":
                        try {
                            Process process = Runtime.getRuntime().
                                    exec("C:\\Windows\\System32\\calc.exe");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                    case "Notepad":
                        try {
                            Process process = Runtime.getRuntime().
                                    exec("C:\\Windows\\System32\\notepad.exe");
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                        break;
                }

            }
        });

        panel.add(button);
        add(panel);

        setVisible(true);

    }

}
