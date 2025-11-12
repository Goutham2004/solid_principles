package Memento;

import javax.swing.text.AbstractDocument;

public class EditorMemento {
    private final String Content;
    public EditorMemento(String Content) {
        this.Content = Content;
    }
    public String getContent(){
        return Content;
    }


}
