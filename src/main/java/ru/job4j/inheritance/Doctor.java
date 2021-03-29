package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean experience;

    public Doctor(String surname,
                  String name,
                  String education,
                  String birthday,
                  boolean experience) {
        super(name, surname, education, birthday);
      this.experience = experience;

    }

    public Boolean getExperience() {
        return this.experience;
    }

}
