package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matrix {
public static List<Integer> tolist(Integer[][] num) {
    return Arrays.stream(num)
             .flatMap(Arrays::stream)
             .collect(Collectors.toList());

}
}