package IST.Machine_badcode;

public class Simple_Printer implements Machine{

    @Override
    public void print(Document doc) {

    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("this is not possible");

    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("this is not possible");


    }


}
