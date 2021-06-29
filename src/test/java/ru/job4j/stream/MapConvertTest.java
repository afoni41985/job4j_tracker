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
                new Student(100, "Sur1"),
                new Student(80, "Sur2"),
                new Student(100, "Sur1")
        );
        Map<String, Student> rsl = MapConvert.convertList(students);
        Map<String, Student> expected = new HashMap<>();
        expected.put("Sur1", new Student(100, "Sur1"));
        expected.put("Sur2", new Student(80, "Sur2"));
        assertThat(rsl, is(expected));
    }
}