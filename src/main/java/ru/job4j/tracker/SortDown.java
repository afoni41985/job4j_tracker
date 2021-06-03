package ru.job4j.tracker;

import java.util.Comparator;

public class SortDown implements Comparator<Item> {
    @Override
    public int compare(Item first, Item two) {
        int rsl = two.getName().compareTo(first.getName());
        if (rsl == 0) {
            rsl = Integer.compare(two.getId(), first.getId());
        }
        return rsl;
    }
}
