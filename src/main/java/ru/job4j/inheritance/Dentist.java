package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private int toothCollection;

    public Dentist(String surname,
                   String name,
                   String education,
                   String birthday,
                   boolean experience,
                   int toothCollection) {
        super(surname, name, education, birthday, experience);
        this.toothCollection = toothCollection;

    }

    public void toDrill(Cat patient) {
    }

    public int getToothCollection() {
        return this.toothCollection;
    }
}

