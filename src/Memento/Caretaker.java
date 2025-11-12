package Memento;

import java.util.Stack;

public class Caretaker {
private final Stack<EditorMemento> history = new Stack<>();

public void saveState(TextEditor editor){
    history.push();
}
public void undo(TextEditor editor){
    if(!history.empty()){
        EditorMemento memento = history.pop();
        editor.setContent(memento.getContent());
    }
}
}
