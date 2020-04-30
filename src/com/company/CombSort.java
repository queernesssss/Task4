package com.company;

public class CombSort {

    public static void combSort(String[] array) {
        for (int gap = array.length - 2; gap >= 0; gap--) {
            for (int i = 0; i <= (array.length - 2) - gap; i++) {
                if (Comparator.compareVowels(array[i], array[i + gap + 1]) || Comparator.compareLength(array[i], array[i + gap + 1])) {
                    String temp = array[i];
                    array[i] = array[i + gap + 1];
                    array[i + gap + 1] = temp;
                }
            }
        }
    }
}
