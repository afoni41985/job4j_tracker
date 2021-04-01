package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] copyItem = new Item[items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (items[i] != null) {
                copyItem[count++] = items[i];
            }
        }
        copyItem = Arrays.copyOf(copyItem, count);
        return copyItem;
    }

    public Item[] findByName(String key) {
        Item[] copyItem = new Item[items.length];
        int count = 0;
        for (Item item : items) {
            if (item.getName().equals(key)) {
                copyItem[count++] = item;
            }
        }
        copyItem = Arrays.copyOf(copyItem, count);
        return copyItem;
    }
}
