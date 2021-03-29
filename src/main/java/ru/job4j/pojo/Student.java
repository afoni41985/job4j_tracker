package ru.job4j.pojo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String surname;
    private String group;
    private Date entrance;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getEntrance() {
        return entrance;
    }

    public void setEntrance(Date entrance) {
        this.entrance = entrance;
    }
}



