package com.github.andreyaleshin.HeadFirstJava.PracticingGUI;

import javax.swing.*;
import java.awt.*;

/**
 * A simple animation class
 */
public class SimpleAnimation {

    int x = 0;
    int y = 0;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    public void go() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyAnimationDrawPanel drawPanel = new MyAnimationDrawPanel();

        frame.getContentPane().add(drawPanel);
        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 220; i++) {
            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }

    class MyAnimationDrawPanel extends JPanel {

        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());

            g.setColor(Color.orange);
            g.fillOval(x, y, 40, 40);
        }
    }

}
