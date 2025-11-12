package Memento;

/**
 * Main class to demonstrate the Memento Design Pattern in a Text Editor application.
 *
 * This class acts as the client that interacts with the Originator (TextEditor)
 * and the Caretaker. It simulates a user's workflow: writing text, saving snapshots
 * of their work, and then reverting to a previously saved state.
 */
public class Main {

    public static void main(String[] args) {
        // Setup: Create the main objects.
        // The 'editor' is the object whose state we want to manage (Originator).
        // The 'caretaker' is the object that will store the history of the editor's states.
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // --- User Action 1: Write initial text and save ---
        System.out.println("--- Writing first draft ---");
        editor.write("Hello World.");
        System.out.println("Current Content: \"" + editor.getContent() + "\"");

        // The user clicks "Save". The caretaker asks the editor for a memento (a snapshot)
        // and stores it in its history stack.
        caretaker.saveState(editor);
        System.out.println(">> State saved.\n");

        // --- User Action 2: Add more text and save again ---
        System.out.println("--- Adding more details ---");
        editor.write("Hello World. This is the Memento Pattern.");
        System.out.println("Current Content: \"" + editor.getContent() + "\"");

        // The user saves again. The caretaker stores a new snapshot.
        // The history now contains two states.
        caretaker.saveState(editor);
        System.out.println(">> State saved.\n");

        // --- User Action 3: Make another change (but don't save) ---
        System.out.println("--- Making a temporary change ---");
        editor.write("Hello World. This is the Memento Pattern. Oops, I made a mistake.");
        System.out.println("Current Content: \"" + editor.getContent() + "\"\n");

        // --- User Action 4: Undo the last change ---
        System.out.println("--- Undoing change ---");
        // The user clicks "Undo". The caretaker pops the most recent memento from its stack
        // and passes it back to the editor, which restores its state from that memento.
        caretaker.undo(editor);
        System.out.println("After Undo: \"" + editor.getContent() + "\"");
    }
}