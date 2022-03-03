package FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CharacterBaseStream {
    public static void main(String[] args)
    {
        //FileReader class ---> character based class
        //1. create an object of FileReader class
        try
        {
            FileReader fr = new FileReader("C:\\Users\\yangyangzhao1213\\TESTFORFILE\\secondtxt.txt");  //have to handle exception
            //read()  --> read single character from the source, it will return -1 at the end of the file.
            System.out.println(fr.read()); //this method need to handle exception too. so we need another catch. this will return ASCIIcode of first character. this will be 77.
            //we can use typing casting convert to char
            int ASCICharacter_Data = fr.read();
            System.out.println((char) ASCICharacter_Data);  // we will get letter but just one.



            //we can use loop to get all the letters
           /* int ASCICharacter_Data;
            while((ASCICharacter_Data = fr.read()) != -1)
            {
                System.out.println((char) ASCICharacter_Data);
            }
            fr.close();*/
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File is missing: " + e);
        }
        catch(IOException o)
        {
            System.out.println(o);
        }



    }
}
