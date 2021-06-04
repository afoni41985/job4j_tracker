package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] elLeft = left.split("\\.");
        String[] elRight = right.split("\\.");
        int l = Integer.parseInt(elLeft[0]);
        int r = Integer.parseInt(elRight[0]);
        return Integer.compare(l, r);
    }
}