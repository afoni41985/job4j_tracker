package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public void toDevelop(Project project) {
    }

    public String getProgramLang() {
        return this.programLang;
    }
}
