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
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
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

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;

    }

    public boolean delete(int id) {
        int index = indexOf(id);
        System.arraycopy(items, index + 1, items, index, size - index - 1);
        size--;
        return indexOf(id) != -1;
    }
}
