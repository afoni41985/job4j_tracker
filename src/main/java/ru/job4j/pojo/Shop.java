package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int count = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
               count = i;
                break;
            }
        }
        return count;
    }
}