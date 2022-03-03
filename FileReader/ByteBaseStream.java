package FileReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteBaseStream {
    public static void main(String[] args)
    {
        //byte base stream for reading data from source
        try
        {
            FileInputStream fin = new FileInputStream("C:\\Users\\yangyangzhao1213\\TESTFORFILE\\secondtxt.txt"); // need to handle the exception
            int i = fin.read(); //need to handle exception too
            System.out.println(i);

        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException o)
        {
            System.out.println(o);
        }

        //the syntax are the same. so when to use character based, when to use byte based???
    }
}
