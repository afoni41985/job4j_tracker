package ru.job4j.pojo;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.nullValue;

public class ShopDropTest {

    @Test
    public void whenDropFirst() {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 10);
        Product[] rsl = ShopDrop.leftShift(products, 1);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1], nullValue());
    }

    @Test
    public void whenDropTwo() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 20);
        products[2] = new Product("Egg", 11);
        products[3] = new Product("Fish", 13);
        products[4] = new Product("Meet", 14);
        Product[] rsl = ShopDrop.leftShift(products, 2);
        assertThat(rsl[0].getName(), is("Milk"));
        assertThat(rsl[1].getName(), is("Bread"));
        assertThat(rsl[2].getName(), is("Fish"));
        assertThat(rsl[3].getName(), is("Meet"));
        assertThat(rsl[4], nullValue());
    }
}