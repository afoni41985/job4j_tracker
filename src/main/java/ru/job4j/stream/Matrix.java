package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Matrix {
    public static List<Integer> tolist(Integer[][] num) {
        return Stream.of(num)
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
    }
}