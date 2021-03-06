package com.github.andreyaleshin.CayHorstmannCoreJava.v1ch10.listFonts;

import java.awt.*;

/**
 * List of fonts that is available in your OS.
 *
 * @author Cay Horstmann
 * @version 1.11 2004-06-05
 */
public class ListFonts {

    public static void main(String[] args) {
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment()
                .getAvailableFontFamilyNames();

        for (String fontName : fontNames)
            System.out.println(fontName);
    }

}

