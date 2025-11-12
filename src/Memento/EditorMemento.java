package Memento;

/**
 * The Memento.
 * This object stores the state of the Originator.
 * It's often designed to be accessible only by the Originator.
 */
public class EditorMemento {
    private final String content;

    public EditorMemento(String content) { this.content = content; }

    public String getContent() { return content; }
}