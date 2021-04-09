package ru.job4j.tracker;

public class ReplaceAction implements UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Edit item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ====");
        int id = input.askInt("Enter id ");
        String name = input.askStr("Enter new name: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println("=== Adding the item was successful ====");
        } else {
            out.println("=== Error. This id does not exist ====");
        }
        return true;
    }
}
