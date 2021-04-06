package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("go");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("количество пассажиров " + passengers);
    }

    @Override
    public double fill(double fuel, double price) {
        return fuel * price;
    }
}
