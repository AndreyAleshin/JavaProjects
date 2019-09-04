package com.github.andreyaleshin.HeadFirstJava.PracticingGUI;

import javax.swing.*;
import java.awt.*;

public class AnimatedDecreasingRectangle {
    int x = 1;
    int y = 1;

    public static void main(String[] args) {
        AnimatedDecreasingRectangle gui = new AnimatedDecreasingRectangle();
        gui.go();
    }

    public void go() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);

        frame.setSize(520, 300);
        frame.setVisible(true);

        for (int i = 0; i < 125; i++, y++, x++) {
            x++;
            drawP.repaint();

            try {
                Thread.sleep(50);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

    }

    class MyDrawP extends JPanel {

        public void paintComponent(Graphics g) {

            g.setColor(Color.white);
            g.fillRect(0, 0, 500, 250);
            g.setColor(Color.blue);
            g.fillRect(x, y, 500 - x * 2, 250 - y * 2);

        }
    }

}
