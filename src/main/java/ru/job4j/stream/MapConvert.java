package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapConvert {
    public static Map<String, Student> convertList(List<Student> st) {
        return st.stream()
                .distinct()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        s -> s));
    }
}
