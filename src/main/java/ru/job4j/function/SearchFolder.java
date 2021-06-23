package ru.job4j.function;

import java.util.*;
import java.util.function.Predicate;

public class SearchFolder {

    public static List<Folder> filter(List<Folder> list, Predicate<Folder> pred) {
        List<Folder> folders = new ArrayList<>();
        for (Folder s : list) {
            if (pred.test(s)) {
                folders.add(s);

            }
        }
        return folders;
    }
}
