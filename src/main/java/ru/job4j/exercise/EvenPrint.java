package ru.job4j.exercise;

import java.util.Arrays;
import java.util.Collections;

public class EvenPrint {
    public static void print(int[] array) {
        Arrays.stream(array)
                .filter(num -> num % 2 == 0)
                .boxed()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);
    }
}
