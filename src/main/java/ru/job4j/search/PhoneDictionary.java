package ru.job4j.search;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> byName = x -> x.getName().contains(key);
        Predicate<Person> bySurname = x -> x.getSurname().contains(key);
        Predicate<Person> byAddress = x -> x.getAddress().contains(key);
        Predicate<Person> byPhone = x -> x.getPhone().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        Predicate<Person> combine = byName.or(bySurname).or(byAddress).or(byPhone);
        for (Person p : persons) {
            if (combine.test(p)) {
                result.add(p);
            }
        }
        return result;
    }
}