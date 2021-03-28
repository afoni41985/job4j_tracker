package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialization;

    public boolean animals(Cat cat) {
        return true;
    }

    public String  getSpecialization() {
        return this.specialization;
    }
}