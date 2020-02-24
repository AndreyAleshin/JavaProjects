package com.brainacad.andreyaa.misc;

class BinarySearch {

    public static void main(String[] args) {

        System.out.println(binarySearch(new int[] {0, 2, 4, 5, 8, 10, 12, 15, 16, 20}, 12));

    }

    private static int binarySearch(int[] a, int key) {

        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int middle = low + (high - low) / 2;

            if (key < a[middle]) {
                high = middle - 1;
            } else if (key > a[middle]) {
                low = middle + 1;
            } else {
                return middle;
            }

        }
        return -1; // no result found (a key is not in the int[] a array)
    }

}
