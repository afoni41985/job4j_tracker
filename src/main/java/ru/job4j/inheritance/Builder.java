package ru.job4j.inheritance;

public class Builder extends Engineer {
    private String permit;

    public void toBuild(Project project) {
    }

    public String getPermit() {
        return this.permit;
    }
}