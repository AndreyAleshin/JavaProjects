package com.github.andreyaleshin.TheSnakeGame;

import javax.swing.*;

/**
 * Youtube video with all information: https://www.youtube.com/watch?v=TJvcYxfQ3J0
 */
public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(370, 375);
        setLocation(0, 0);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {

        MainWindow mainWindow = new MainWindow();

    }

}
