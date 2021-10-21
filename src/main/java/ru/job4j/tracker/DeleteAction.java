package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Delete item ====");
        int id = input.askInt("Enter Id: ");
        if (tracker.delete(id)) {
            out.println("=== Item deletion was successful ====");
        } else {
            out.println("=== Error. This id does not exist ====");
        }
        return true;
    }
}
