package FileDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Runnable {
    public static void main(String[] args) throws MyFileException, FileNotFoundException {
//==========Before we use the file class, we have to create an object.
        String path = "C:\\Users\\yangyangzhao1213\\TESTFORFILE";
        File dir = new File(path);


//=======================list()====return array of string===============
        String[] accessFileName = dir.list();
        System.out.println(Arrays.toString(accessFileName));

//=======================listFiles()====return array of files name===============
        File[] FilewithPath = dir.listFiles();
        System.out.println(Arrays.toString(FilewithPath));

//=======================exceptions========================================
        if (dir.isDirectory())
        {
            System.out.println("This is pointing to diectory ");
        }
        else
        {
            throw new MyFileException("This is not pointing to diectory");
        }

//=======================one more aobjects========================================
        String path2 = "C:\\Users\\yangyangzhao1213\\TESTFORFILE";
        File f = new File(path2);
        //we can use scanner class to read the file.
        Scanner sc = new Scanner(f);  // we need to throws the exception
        while (sc.hasNext()) // return true until last character
        {
            String RedaLinebyLine = sc.nextLine();
            System.out.println(RedaLinebyLine);
        }


//=======================isAbsolute=====return is true or false====boolean datatype======
        System.out.println("The path is absolute path: " + f.isAbsolute());

//=======================getAbsolutePath=====return where the file located================
        System.out.println(f.getAbsolutePath());

//==========================return where is the document directly parent=====================================
        System.out.println(f.getParent());

//=======================existes()=======we use with if normarlly========return ture or false=========
        System.out.println(f.exists());
        if (f.exists()) {
            System.out.println("file is found");
            System.out.println("Is file readable: " + f.canRead());
            System.out.println("Is file writeable: " + f.canWrite());
            System.out.println("file size in bytes: " + f.length());
        }
        else {
            System.out.println("File is not found");
        }

//======mkdir=========to create a folder=========
            String folderPath = "C:\\Users\\yangyangzhao1213\\TESTFORFILE\\createanewfolder";
            File fcreatefolder = new File(folderPath);
            if (fcreatefolder.isDirectory()) // if the folder in the director flase/ ture, if false then excute else if.
            {
                System.out.println("directory can not ne created");
            }
            else if(fcreatefolder.mkdir());//
                {
                    System.out.println("folder is created");
                }
            }


}
