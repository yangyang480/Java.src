package FileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


//==============Display all the content from the three files.================
public class FilePactice {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:\\Users\\yangyangzhao1213\\TESTFORFILE";

        File dir = new File(path);
        String [] accesspath1 = dir.list();

        for (int i = 0; i < accesspath1.length; i++)
        {
            File file = new File("C:\\Users\\yangyangzhao1213\\TESTFORFILE\\" + accesspath1[i]);
            if (file.exists())
            {
                Scanner sc = new Scanner(file);
                String data = "";
                while(sc.hasNext())
                {
                    data += sc.nextLine();
                }
                System.out.println(data);
            }
        }
        // for enhance loop can do this too.




//====================read raw file use , to seperate =========================
        String fname1 = "C:\\Users\\yangyangzhao1213\\TESTFORFILE\\cars.txt";
        File f = new File(fname1);
        Scanner sc1 = new Scanner(f);
        String data = "";
        String lines = "";


        while(sc1.hasNextLine())
       {
            data = sc1.nextLine();
            System.out.println(Arrays.toString(data.split(",")));
       }



    }
}
