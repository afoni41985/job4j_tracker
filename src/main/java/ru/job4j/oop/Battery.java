package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
       another.load += this.load;
       this.load = 0;

    }

    public static void main(String[] args) {
        Battery duracell = new Battery(9);
        Battery energizer = new Battery(4);
        duracell.exchange(energizer);
    }
}