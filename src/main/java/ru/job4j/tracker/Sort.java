package ru.job4j.tracker;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        return first.getName().compareTo(second.getName());
    }

    public List<Item> sortNameUp(List<Item> list) {
        Collections.sort(list, new Sort());
        return list;
    }

    public List<Item> sortedNameDown(List<Item> list) {
        sortNameUp(list);
        Collections.reverse(list);
        return list;
    }
}

