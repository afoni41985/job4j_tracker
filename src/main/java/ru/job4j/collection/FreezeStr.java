package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        char[] first = left.toCharArray();
        char[] second = right.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char symbol : first) {
            if (map.containsKey(symbol)) {
                int temp = map.get(symbol);
                map.put(symbol, ++temp);
            } else {
                map.put(symbol, 1);
            }
        }
        for (char symbol : second) {
            if (map.containsKey(symbol)) {
                if (map.get(symbol) > 1) {
                    int temp = map.get(symbol);
                    map.put(symbol, --temp);
                } else {
                    map.remove(symbol);
                }
            } else {
                break;
            }
        }
        return map.size() == 0;
    }
}