package ru.job4j.poly;

public interface Transport {
    public void drive();

    public void passengers(int passengers);

    public double fill(double fuel, double price);
}
