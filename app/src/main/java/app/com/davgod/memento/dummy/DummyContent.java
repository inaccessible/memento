package app.com.davgod.memento.dummy;

import java.util.ArrayList;
import java.util.List;

import app.com.davgod.memento.Note.Note;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<Note> ITEMS = new ArrayList<>();

    static {
        // Add 3 sample items.
        addItem(new Note(1, "Описание для записа 1", false, ""));
        addItem(new Note(2, "Описание для записа 2", true, ""));
        addItem(new Note(3, "Описание для записа 3", false, ""));
    }

    private static void addItem(Note item) {
        ITEMS.add(item);
    }

}
