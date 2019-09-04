package com.brainacad.andreyaa.misc;

/**
 * A common bubble sorting method
 */
class Bubble {
    public static void main(String[] args) {

        int[] nums = {99, -10, 100123, 18, -978,
                5623, 463, -9, 287, 49};
        int a, b, t;
        int size;
        size = 10; // Кол-во сортируемых элементов

        // Отобразить исходный массив
        System.out.println("Исходный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();

        // Реализация алгоритма пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (nums[b - 1] > nums[b]) {
                    // Если требуемый порядок следования
                    // не соблюдается, поменять элементы местами.
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }

        // Отобразить отсортированный массив
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + nums[i]);
        System.out.println();
    }
}

class StrBubble {
    public static void main(String[] args) {

        String[] strs = {"this", "is", "a", "test",
                "of", "a", "string", "sort"
        };
        int a, b;
        int size;
        String t;
        size = strs.length; // Кол-во сортируемых элементов

        // Отобразить исходный массив
        System.out.println("Исходный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();

        // Реализация алгоритма пузырьковой сортировки
        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                // Если требуемый порядок следования
                // не соблюдается, поменять элементы местами.
                if (strs[b - 1].compareTo(strs[b]) > 0) {
                    t = strs[b - 1];
                    strs[b - 1] = strs[b];
                    strs[b] = t;
                }
            }

        // Отобразить отсортированный массив
        System.out.println("Отсортированный массив:");
        for (int i = 0; i < size; i++)
            System.out.print(" " + strs[i]);
        System.out.println();
    }
}