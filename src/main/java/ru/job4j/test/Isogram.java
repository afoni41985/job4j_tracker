package ru.job4j.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        String[] strings = s.split("");
        Set<String> strings1 = new HashSet<>(Arrays.asList(strings));
        return strings.length == strings1.size();
    }
}