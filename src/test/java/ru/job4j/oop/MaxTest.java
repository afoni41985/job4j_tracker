package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax3A1B3Then3() {
        int result = Max.max(1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax5A5B4Then4() {
        int result = Max.max(5, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax2A2B2Then2() {
        int result = Max.max(2, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4A1B2C3D4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void testMax7A5B6C7Then7() {
        int result = Max.max(5, 6, 7);
        assertThat(result, is(7));
    }
}
