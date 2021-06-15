package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        } else {
            char[] chLeft = left.toCharArray();
            char[] chRight = right.toCharArray();
            Arrays.sort(chLeft);
            Arrays.sort(chRight);
            Map<Character, Integer> map1 = new HashMap<>();
            Map<Character, Integer> map2 = new HashMap<>();

            for (int i = 0; i < chLeft.length; i++) {
                map1.put(chLeft[i], i);
                map2.put(chRight[i], i);
            }

            return map1.equals(map2);
        }
    }

}