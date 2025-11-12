package lst.lstbadcode;



public class Main {
    public static void main(String[] args) {
        file file1 = new readonlyfile();
        file1.read();
        file1.write(); // throwing the error
        // the upper one is the clear voilation of lsp that causes to write a bad code ,
        file1.delete();
    }
}
