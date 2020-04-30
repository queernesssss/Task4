package com.company;

public class Main {

    public static void test() {
        String[] array = new String[6];
        array[0] = "uuusuuu";
        array[1] = "aaaaaaaaaaaaa";
        array[2] = "iiiiiiiiiii";
        array[3] = "eeeeeeseeeeee";
        array[4] = "iiiiiiiii";
        array[5] = "eeeeessseeeee";
        CombSort.combSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        test();
    }
}
