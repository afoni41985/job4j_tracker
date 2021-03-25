package ru.job4j.oop;

public class Max {
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(c, max(a, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(d, max(c, max(a, b)));
    }

    public static void main(String[] args) {
        System.out.println(Max.max(1, 2, 3, 4));
    }
}