package ru.job4j.bank;

import java.util.*;

/**
 * Класс описывает работу банковской системы и может производить следующие действия:
 * 1. Регистрировать пользователя.
 * 2. Удалять пользователя из системы.
 * 3. Добавлять пользователю банковский счет. У пользователя системы могут быть несколько счетов.
 * 4. Переводить деньги с одного банковского счета на другой счет.
 *
 * @author Афонин А.И.
 * @version 1.0
 */

public class BankService {

    /**
     * Хранение пользователей системы с привзанными к ним счетам осуществляется в
     * коллекции HashMap
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в систему.
     * В методе есть проверка, что такого пользователя еще нет в системе. Если он есть,
     * то нового не добавляет.
     *
     * @param user добавляет пользователя.
     */

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод принимает пользователя по паспорту и его счету,
     * Если такого счета у пользователя нет,  метод добовляем новый счет
     * к списку счетов пользователя
     *
     * @param passport - объект в качестве паспорта
     * @param account  - объект в качестве счета пользователя.
     */

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }

    }

    /**
     * Метод ищет пользователя по паспорту, и возвращает найденного пользователя
     *
     * @param passport - паспорт
     * @return - пользователь
     */

    public Optional<User> findByPassport(String passport) {
        return users.keySet().stream()
                .filter(x -> x.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет счет пользователя по паспорту и реквизитам пользователя
     *
     * @param passport  - паспорт
     * @param requisite - реквизиты
     * @return - вернуть найденный счет
     */

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        return user.flatMap(value -> users.get(value).stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst());
    }

    /**
     * Метод для перечисления денег с одного счета на другой счет
     *
     * @param srcPassport   - поспорт пользовател отправителя
     * @param srcRequisite  -  реквизиты счета пользователя отправителя
     * @param destPassport  - паспорт получателя
     * @param destRequisite - реквизиты счета получателя
     * @param amount        - сумма перевода
     * @return - перевод выполнен удачно - true, false - перевод невозможен
     */

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> src = findByRequisite(srcPassport, srcRequisite);
        Optional<Account> dest = findByRequisite(destPassport, destRequisite);
        if (src.isPresent() && dest.isPresent() && src.get().getBalance() >= amount) {
            src.get().setBalance(src.get().getBalance() - amount);
            dest.get().setBalance(dest.get().getBalance() + amount);
            return true;
        }
        return false;
    }
}