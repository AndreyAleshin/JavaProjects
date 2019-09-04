package com.brainacad.andreyaa.labs.java_swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionApp3 extends JFrame implements ActionListener {

    static JTextField textField;
    static JFrame frame;
    static JButton button;
    static JLabel label;

    public static void main(String[] args) {

        frame = new JFrame("Text field");
        label = new JLabel("Enter your text");
        button = new JButton("Submit");

        ActionApp3 app = new ActionApp3();
        button.addActionListener(app);
        textField = new JTextField(16); // добавление слушателя на кнопку
        JPanel p = new JPanel();
        p.add(textField);
        p.add(button);
        p.add(label);

        frame.add(p);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        if (s.equals("Submit")) {
            label.setText(textField.getText());
        }
    }
}
