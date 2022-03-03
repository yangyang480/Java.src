package FileReader;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


public class FilewriterDemo {

    public static void main(String[] args) throws IOException {

       //filewriter is character based stream
        FileWriter w = new FileWriter("C:\\Users\\yangyangzhao1213\\TESTFORFILE\\hi.txt");// need to handle exception will create the new file
        w.write(65); // will write the new character in the file. we can use ASCICode
        String content = " hi I am learning";
        w.write(content);
        w.write('\n');
        String content2 = "Wish you luck";
        w.write(content2);
        w.close();


        try
        {
            FileOutputStream fout = new FileOutputStream("C:\\Users\\yangyangzhao1213\\TESTFORFILE\\second.txt");
            String s = "Welcome to Java";
            byte b[] = s.getBytes(StandardCharsets.UTF_8);
            fout.write(b);
            fout.close();
            System.out.println("success..");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
