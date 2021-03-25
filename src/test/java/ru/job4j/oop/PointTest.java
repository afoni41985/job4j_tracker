package ru.job4j.oop;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class PointTest {

    @Test
    public void testDistance() {
        Point x = new Point(0, 0);
        Point y = new Point(0, 2);
        double rsl = x.distance(y);
        assertThat(rsl, closeTo(2, 5.999));
    }

    @Test
    public void testDistance3d() {
        Point x = new Point(1, 2, 3);
        Point y = new Point(0, 2, 5);
        double rsl = x.distance3d(y);
        assertThat(rsl, closeTo(3, 4.999));
    }
}
