package Memento;

public class TextEditorMain {
    public static void main(String[] args) {
       TextEditor editor = new TextEditor();
       editor.write("hdfgbhsbfg");
       editor.write("The master stroke");
        System.out.println(editor.getContent());
    }
}
