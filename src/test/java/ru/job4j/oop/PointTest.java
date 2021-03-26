package ru.job4j.oop;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void testDistance() {
        Point x = new Point(0, 0);
        Point y = new Point(0, 2);
        double rsl = x.distance(y);
        assertThat(rsl, is(2.0));
    }

    @Test
    public void testDistance3d() {
        Point x = new Point(1, 2, 3);
        Point y = new Point(0, 2, 5);
        double rsl = x.distance3d(y);
        assertEquals(rsl, 2.23, 0.01);
    }
}
