package IST.Machine_goodcode;

public class Multi_Purpose_Machine implements Printer,Scanner{

    @Override
    public void print() {
        System.out.println("Prints the elements");
    }

    @Override
    public void scan() {
        System.out.println("Scans the elements");


    }
}
