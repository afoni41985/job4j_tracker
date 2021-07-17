package ru.job4j.test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        boolean rsl = false;
        Set<String> strings = new HashSet<>(Arrays.asList(combination));
        if (strings.size() == 1) {
            rsl = true;
        }
        return rsl;
    }
}