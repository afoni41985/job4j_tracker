package ru.job4j.stream;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MatrixTest {
    @Test
    public void whenMatrixToMap() {
        Integer[][] num = {{1, 2, 3, 4}, {8, 7, 6, 5}, {9, 10, 11, 12}};
        List<Integer> result = Matrix.tolist(num);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 7, 6, 5, 9, 10, 11, 12);
        assertThat(result, is(expected));
    }
}