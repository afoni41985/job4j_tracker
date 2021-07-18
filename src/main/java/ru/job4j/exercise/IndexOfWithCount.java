package ru.job4j.exercise;

import java.util.Arrays;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                rsl = i;
            }
        }
        return rsl;
    }
}