package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void sortPriorityUp() {
        Job item1 = new Job("one", 1);
        Job item2 = new Job("two", 2);
        Job item3 = new Job("three", 3);
        Job item4 = new Job("four", 4);
        List<Job> item = Arrays.asList(item3, item1, item4, item2);
        List<Job> expected = Arrays.asList(item1, item2, item3, item4);
        Collections.sort(item, new SortByPriorityUp());
        assertThat(item, is(expected));
    }

    @Test
    public void sortPriorityDown() {
        Job item1 = new Job("one", 1);
        Job item2 = new Job("two", 2);
        Job item3 = new Job("three", 3);
        Job item4 = new Job("four", 4);
        List<Job> item = Arrays.asList(item3, item1, item4, item2);
        List<Job> expected = Arrays.asList(item4, item3, item2, item1);
        Collections.sort(item, new SortByPriorityDown());
        assertThat(item, is(expected));
    }

    @Test
    public void sortNameUp() {
        Job item1 = new Job("one", 1);
        Job item2 = new Job("two", 2);
        Job item3 = new Job("three", 3);
        Job item4 = new Job("four", 4);
        List<Job> item = Arrays.asList(item3, item1, item4, item2);
        List<Job> expected = Arrays.asList(item4, item1, item3, item2);
        Collections.sort(item, new SortByNameUp());
        assertThat(item, is(expected));
    }

    @Test
    public void sortNameDown() {
        Job item1 = new Job("one", 1);
        Job item2 = new Job("two", 2);
        Job item3 = new Job("three", 3);
        Job item4 = new Job("four", 4);
        List<Job> item = Arrays.asList(item3, item1, item4, item2);
        List<Job> expected = Arrays.asList(item2, item3, item1, item4);
        Collections.sort(item, new SortByNameDown());
        assertThat(item, is(expected));
    }

    @Test
    public void whenCompatorByNameAndProrityDown() {
        Job item1 = new Job("one", 1);
        Job item2 = new Job("two", 2);
        Job item3 = new Job("three", 3);
        Job item4 = new Job("four", 4);
        List<Job> item = Arrays.asList(item3, item1, item4, item2);
        List<Job> expected = Arrays.asList(item2, item3, item1, item4);
        Collections.sort(item, new SortByNameDown().thenComparing(new SortByNameDown()));
        assertThat(item, is(expected));
    }

    @Test
    public void whenCompatorByNameAndProrityUp() {
        Job item1 = new Job("one", 1);
        Job item2 = new Job("two", 2);
        Job item3 = new Job("three", 3);
        Job item4 = new Job("four", 4);
        List<Job> item = Arrays.asList(item3, item1, item4, item2);
        List<Job> expected = Arrays.asList(item4, item1, item3, item2);
        Collections.sort(item, new SortByNameUp().thenComparing(new SortByNameUp()));
        assertThat(item, is(expected));
    }
}