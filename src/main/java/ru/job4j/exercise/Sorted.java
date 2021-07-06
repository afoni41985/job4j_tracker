package ru.job4j.exercise;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Sorted {
    public static boolean isSorted(int[] array) {
        boolean rsl = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1]) {
                rsl = false;
            }
        }
        return rsl;
    }
}
