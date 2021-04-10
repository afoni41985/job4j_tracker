package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StartUITest {
    @Test
    public void whenCreateItem() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0", "Item name", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplaceItemStubInput() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replaced item"));
        String replacedName = "New item name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), replacedName, "1"}
        );
        UserAction[] actions = {
                new ReplaceAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItemStubInput() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Deleted item"));
        Input in = new StubInput(
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        UserAction[] actions = {
                new DeleteAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(nullValue()));
    }

    @Test
    public void whenExit() {
        Output output = new StubOutput();
        Input in = new StubInput(
                new String[]{"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(output.toString(), is(
                "Menu." + System.lineSeparator() + "0. Exit" + System.lineSeparator()
        ));
    }

    @Test
    public void whenFindAllAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        // Добавим в tracker новую заявку
        Item item = tracker.add(new Item("first item"));
        Input in = new StubInput(
                //  0 - это пункт меню "Создать новую заявку"
                //"Item name" - это будет имя новой заявки.
                //1 - это пункт меню "Выйти".
                new String[]{"0", "1"}
        );
        // Показать меню
        UserAction[] actions = {
                new ShowAction(),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("first item"));
    }

    @Test
    public void whenFindByNameAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        // Добавим в tracker новую заявку
        Item item = tracker.add(new Item("second item"));
        Input in = new StubInput(
                //  0 - это пункт меню "Создать новую заявку"
                //"Item name" - это будет имя новой заявки.
                //1 - это пункт меню "Выйти".
                new String[]{"0", "second item", "1"}
        );
        // Показать меню
        UserAction[] actions = {
                new FindByNameAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        Item[] result = tracker.findByName(item.getName());
        assertThat(result[0].getName(), is(item.getName()));
    }

    @Test
    public void whenFindByIdAction() {
        Output output = new StubOutput();
        Tracker tracker = new Tracker();
        // Добавим в tracker новую заявку
        Item item = tracker.add(new Item("third item"));
        Input in = new StubInput(
                //  0 - это пункт меню "Создать новую заявку"
                //"Item name" - это будет имя новой заявки.
                //1 - это пункт меню "Выйти".
                new String[]{"0", String.valueOf(item.getId()), "1"}
        );
        // Показать меню
        UserAction[] actions = {
                new FindByIdAction(output),
                new ExitAction(output)
        };
        new StartUI(output).init(in, tracker, actions);
        Item[] result = tracker.findByName(item.getName());
        assertThat(result[0].getId(), is(item.getId()));
    }

}