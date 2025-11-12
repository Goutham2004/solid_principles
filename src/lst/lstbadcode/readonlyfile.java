package lst.lstbadcode;

public class readonlyfile extends file{
    public void read (){
        System.out.println("read1 the file");
    }
    public void write(){
         throw new UnsupportedOperationException("cant write into a just readfile");
    }

}
