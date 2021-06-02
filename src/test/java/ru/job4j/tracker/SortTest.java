package ru.job4j.tracker;

import junit.framework.TestCase;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;


import java.util.Arrays;
import java.util.List;

public class SortTest {
    @Test
    public void SortUp() {
        Sort sort = new Sort();
        Item item1 = new Item("A", 1);
        Item item2 = new Item("B", 2);
        Item item3 = new Item("C", 3);
        List<Item> items = Arrays.asList(item2, item1, item3);
        List<Item> expected = Arrays.asList(item1, item2, item3);
        assertThat(sort.sortNameUp(items), is(expected));
    }

    @Test
    public void SortDown() {
        Sort sort = new Sort();
        Item item1 = new Item("A", 1);
        Item item2 = new Item("B", 2);
        Item item3 = new Item("C", 3);
        List<Item> items = Arrays.asList(item2, item1, item3);
        List<Item> expected = Arrays.asList(item3, item2, item1);
        assertThat(sort.sortedNameDown(items), is(expected));
    }
}