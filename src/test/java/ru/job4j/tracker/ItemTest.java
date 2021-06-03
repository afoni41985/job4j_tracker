package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ItemTest {

    @Test
    public void sortByNameUp() {
        Item item1 = new Item("a", 1);
        Item item2 = new Item("b", 2);
        Item item3 = new Item("c", 3);
        List<Item> rsl = Arrays.asList(item2, item1, item3);
        List<Item> expected = Arrays.asList(item1, item2, item3);
        Collections.sort(rsl, new SortByNameUp());
        assertThat(rsl, is(expected));
    }

    @Test
    public void sortByNameDown() {
        Item item1 = new Item("a", 1);
        Item item2 = new Item("b", 2);
        Item item3 = new Item("c", 3);
        List<Item> rsl = Arrays.asList(item1, item2, item3);
        List<Item> expected = Arrays.asList(item3, item2, item1);
        Collections.sort(rsl, new SortByNameDown());
        assertThat(rsl, is(expected));
    }
}