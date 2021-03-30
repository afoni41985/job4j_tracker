package ru.job4j.pojo;

public class Shop {
    public static int indexOfNull(Product[] products) {
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == null) {
               count = i;
                break;
            } else {
                count = -1;
            }
        }
        return count;
    }
}