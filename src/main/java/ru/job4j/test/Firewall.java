package ru.job4j.test;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String[] strings = s.toLowerCase().split(" ");
        for (String string : strings) {
            if (words.contains(string)) {
                return "Выберите другую статью...";
            }
        }
        return "Вы сделали правильный выбор!";

    }
}