package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname(" Afonin Aleksei Igorevich");
        student.setGroup(" Intern");
        student.setEntrance(new Date());

        System.out.println("Student" + student.getSurname() + System.lineSeparator() + "group"
                + student.getGroup() + System.lineSeparator() + "enrolled" + student.getEntrance());
    }
}
