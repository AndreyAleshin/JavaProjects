package com.brainacad.andreyaa.lms.java_fundamentals.lab2_8_abstract_classes_and_interfaces;

import java.util.Comparator;

class ShapeColorComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return ((Shape) o1).getShapeColor().compareTo(((Shape) o2).getShapeColor());
    }

}
