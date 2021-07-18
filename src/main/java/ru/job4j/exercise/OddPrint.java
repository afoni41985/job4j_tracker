package ru.job4j.exercise;
import java.util.Arrays;
import java.util.Collections;

public class OddPrint {
    public static void print(int[] array) {
        Arrays.stream(array)
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }
}