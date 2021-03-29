package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private String specialization;

    public Surgeon(String surname,
                   String name,
                   String education,
                   String birthday,
                   boolean experience,
                   String specialization) {
        super(name, surname, education, birthday, experience);
        this.specialization = specialization;
    }

    public boolean animals(Cat cat) {
        return true;
    }

    public String getSpecialization() {
        return this.specialization;
    }
}