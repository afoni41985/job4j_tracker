package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        for (int i = 0; (i < left.length()) && (i < right.length()); i++) {
            result = Integer.compare(left.charAt(i), right.charAt(i));
            if (left.charAt(i) != right.charAt(i)) {
                break;
            }
        }
        if ((result == 0) && (left.length() != right.length())) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}