package ru.job4j.collection;

import java.util.*;

public class Article {
    public static boolean generateBy(String origin, String line) {
        boolean rsl = true;
        String[] originText = origin.split("[., :;!]");
        String[] lineText = line.split("[., :;!]");
        Set<String> check = new HashSet<>(Arrays.asList(originText));
        for (String word : lineText) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}