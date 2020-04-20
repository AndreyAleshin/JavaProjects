package com.brainacad.andreyaa.lms.java_se.lab3_4_java_gui_programming.lab3_4_4_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyApp extends JFrame {

    private static JTextField textField1, textField2, textField3;
    private static JButton button1, button2;
    private static JLabel label1, label2, label3;

    private static JMenuBar menuBar;
    private JMenu message;
    private JMenuItem question, inputName;


    MyApp(String title) {

        super(title);
        setSize(500, 200);
        setLocation(50, 50);
        setLayout(new GridLayout(4, 3));

        createMenu();

        button1 = new JButton("Get user name");
        button2 = new JButton("Get computer name");
        textField1 = new JTextField(16);
        textField2 = new JTextField(16);
        label1 = new JLabel("Enter user name");
        label2 = new JLabel("Enter computer name");

        label3 = new JLabel("Result: ");
        textField3 = new JTextField(32);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("Get user name")) {
                    label1.setText(textField1.getText());
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = e.getActionCommand();
                if (str.equals("Get computer name")) {
                    label2.setText(textField2.getText());
                }
            }
        });

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel1.add(button1);
        panel1.add(textField1);
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel2.add(button2);
        panel2.add(textField2);
        panel2.add(label2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3.add(label3);
        panel3.add(textField3);

        add(menuBar);
        add(panel1);
        add(panel2);
        add(panel3);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }

    private void createMenu() {

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        message = new JMenu("Message");
        inputName = new JMenuItem("Input name");
        question = new JMenuItem("Question");

        inputName.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter a username");
                textField3.setText(str);        
            }
        });

        question.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = String.valueOf(JOptionPane.showConfirmDialog(null,
                        "Are you ready to undergo the test?"));
                switch (str) {
                    case "0" -> textField3.setText("Yes");
                    case "1" -> textField3.setText("No");
                    case "2" -> textField3.setText("Cancel");
                }
            }
        });

        message.add(inputName);
        message.add(question);

        menuBar.add(message);

    }


}
