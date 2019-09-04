package com.brainacad.andreyaa.labs.java_swing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx extends JApplet {

    private Component b[] = new Component[7];

    public void init() {

        /*две строки, четыре столбца */
        setLayout(new GridLayout(2, 4));

        for (int i = 0; i < b.length; i++) {
            add((b[i] = new JButton("(" + i + ")")));
        }
    }
}
