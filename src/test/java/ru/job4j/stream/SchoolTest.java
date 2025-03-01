package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
    @Test
    public void whenCollectClassA() {
        List<Student> students = List.of(
                new Student("Surname1", 10),
                new Student("Surname4", 40),
                new Student("Surname5", 50),
                new Student("Surname7", 60),
                new Student("Surname9", 90)
        );
        School sc = new School();
        Predicate<Student> pr = s -> s.getScore() >= 70 && s.getScore() <= 100;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname9", 90));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassB() {
        List<Student> students = List.of(
                new Student("Surname2", 20),
                new Student("Surname3", 30),
                new Student("Surname5", 40),
                new Student("Surname6", 50),
                new Student("Surname8", 60)
        );
        School sc = new School();
        Predicate<Student> pr =  s -> s.getScore() >= 50 && s.getScore() < 70;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname6", 50));
        expected.add(new Student("Surname8", 60));
        assertThat(rsl, is(expected));
    }

    @Test
    public void whenCollectClassV() {
        List<Student> students = List.of(
                new Student("Surname1", 10),
                new Student("Surname4", 40),
                new Student("Surname5", 50),
                new Student("Surname7", 60),
                new Student("Surname9", 90)
        );
        School sc = new School();
        Predicate<Student> pr = s -> s.getScore() > 0 && s.getScore() < 50;
        List<Student> rsl = sc.collect(students, pr);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("Surname1", 10));
        expected.add(new Student("Surname4", 40));
        assertThat(rsl, is(expected));
    }
}