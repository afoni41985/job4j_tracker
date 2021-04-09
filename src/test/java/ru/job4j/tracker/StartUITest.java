package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItemStubInput() {
        Input in = new StubInput(
                new String[]{"0", "1", "New item name", "1"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        UserAction[] actions = {
                new ReplaceAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("New item name"));
    }

    @Test
    public void whenDeleteItemStubInput() {
        Input in = new StubInput(
                new String[]{"0", "1", "1", "2"}
        );
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        UserAction[] actions = {
                new DeleteAction(),
                new ExitAction()
        };
        new StartUI().init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }
}