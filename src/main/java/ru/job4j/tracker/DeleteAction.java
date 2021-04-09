package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        int id = input.askInt("Enter Id: ");
        if (tracker.delete(id)) {
            System.out.println("=== Item deletion was successful ====");
        } else {
            System.out.println("=== Error. This id does not exist ====");
        }
        return true;
    }
}
