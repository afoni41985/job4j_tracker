package ru.job4j.stream;

import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MapConvertTest {
    @Test
    public void whenCollectToMap() {
        List<Student> students = List.of(
                new Student("Sur1", 100),
                new Student("Sur2", 80),
                new Student("Sur1", 100)
        );
        Map<String, Student> rsl = MapConvert.convertList(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Sur1", new Student("Sur1", 100));
        expected.put("Sur2", new Student("Sur2", 80));
        assertThat(rsl, is(expected));
    }
}