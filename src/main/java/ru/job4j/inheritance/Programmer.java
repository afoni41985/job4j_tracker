package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programLang;

    public Programmer(String name,
                      String surname,
                      String education,
                      String birthday,
                      String category,
                      String programLang) {
        super(name, surname, education, birthday, category);
        this.programLang = programLang;
    }

    public void toDevelop(Project project) {
    }

    public String getProgramLang() {
        return this.programLang;
    }
}
