package FileDemo;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WriteDetailFile {
    public static void main(String[] args) throws IOException {

        // create a file
        String fname = "C:\\Users\\yangyangzhao1213\\TESTFORFILE\\firsttxt.txt";
        File dir = new File(fname);
        FileWriter mywriter = new FileWriter(fname, false);

        // content will be replace if you do this multiple times. //since we are using false.
        mywriter.write("This is new");
        mywriter.close(); // we have to close it otherwise will not be show.

        // if we want to keep them all. then we got use true in the FileWriter method.

        String fname1 = "C:\\Users\\yangyangzhao1213\\TESTFORFILE\\secondtxt.txt";
        File dir1 = new File(fname1);
        dir1.createNewFile(); //we create a new file here.
        FileWriter mywrite1 = new FileWriter(fname1, true);
        Date d = new Date();
        String currentTime = String.valueOf(d.getTime());
        mywrite1.write("Message come here");
        mywrite1.close();



    }
}
