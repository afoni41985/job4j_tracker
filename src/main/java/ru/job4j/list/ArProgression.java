package ru.job4j.list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int rsl = 0;
        rsl = data.get(0) + data.get(1);
        for (int i = 2; i < data.size(); i++) {
            if (data.get(i - 1) == (data.get(i - 2) + data.get(i)) / 2) {
                rsl += data.get(i);
            } else {
                return 0;
            }
        }

        return rsl;
    }
}