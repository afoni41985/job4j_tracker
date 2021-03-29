package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String permit;

    public Builder(String name,
                   String surname,
                   String education,
                   String birthday,
                   String category,
                   String permit) {
        super(name, surname, education, birthday, category);
        this.permit = permit;
    }

    public void toBuild(Project project) {
    }

    public String getPermit() {
        return this.permit;
    }
}