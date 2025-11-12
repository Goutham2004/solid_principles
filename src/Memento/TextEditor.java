package Memento;

/**
 * The Originator.
 * This is the object whose state we want to save.
 * It can create a Memento to save its state and use a Memento to restore it.
 */
public class TextEditor {
    private String content;

    public void write(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }

    /**
     * Creates a memento containing a snapshot of the editor's current state.
     */
    public EditorMemento save() {
        return new EditorMemento(content);
    }

    /**
     * Restores the editor's state from a memento object.
     */
    public void restore(EditorMemento memento) {
        content = memento.getContent();
    }
}
