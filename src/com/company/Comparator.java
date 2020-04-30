package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Comparator {

    public static boolean compareVowels(String string1, String string2) {
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'y'));
        int string1Counter = 0;
        int string2Counter = 0;
        for (int i = 0; i < string1.length(); i++) {
            if (set.contains(string1.charAt(i))) {
                string1Counter++;
            }
        }
        for (int i = 0; i < string2.length(); i++) {
            if (set.contains(string2.charAt(i))) {
                string2Counter++;
            }
        }
        return string1Counter < string2Counter;
    }

    public static boolean compareLength(String string1, String string2) {
        return string1.length() < string2.length();
    }
}
