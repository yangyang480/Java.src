package class_wrapper_math;

import java.util.Scanner;

public class ScannerObject {

    public static void main(String[] args) {

        //create an object of scanner class
        System.out.println("Enter your name: ");
        Scanner a = new Scanner(System.in); // Scanner is class name
        String name = a.nextLine();  //a. you can select the method, once you choose a method, you can see the return type, then specify the return type in front.
        System.out.println("Your name is: " + name);

        System.out.println("Enter your age: ");
        Scanner b = new Scanner(System.in);
        int age = b.nextInt();
        System.out.println("Your age is: " + age);
    }
}
