package Memento;

import java.util.Stack;

/**
 * The Caretaker.
 * This object is responsible for keeping the mementos. It does not inspect or
 * operate on the mementos. It just holds them for the Originator to use later.
 */
public class Caretaker {
    private final Stack<EditorMemento> history = new Stack<>();

    /**
     * Asks the editor to create a memento and pushes it onto the history stack.
     */
    public void saveState(TextEditor editor) {
        history.push(editor.save());
    }

    /**
     * Pops the most recent memento from history and asks the editor to restore its state.
     */
    public void undo(TextEditor editor) {
        if (!history.empty()) {
            editor.restore(history.pop());
        }
    }
}
