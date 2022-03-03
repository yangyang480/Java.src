package if_loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //for, while, do while.
       /* for (condition){
            body of the loop
        }*/

        //----------------for ----------------------------
        for (int i = 0; i <= 10; i++){//conditions
            System.out.println(i + " Hello World");//body for the loop
        } //will print 10 times.

        for (int a =10; a >= 0; a--){
           System.out.println(a + " Hi");
        }

        //multiple loops
        for (int iii = 1; iii <= 3; iii++){
            for (int jjj = 1; jjj <= 3; jjj++){
                System.out.println(iii + ' ' + jjj);
            }
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < i; j++) {
                String a = "*";
                System.out.print(a);
            } System.out.println("");
        }
//mine code below:
 /*       Scanner z = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = z.nextInt();
        for (int y = 0; y % 1 == 0; y++) {
            if (num % y == 0) {
                System.out.println("Prime number");
            } else{
                System.out.println("not prime number");
            }
        }
*/
        // Take a Number from User as input and veritify that is PRime number ot non prime number
        System.out.println("Enter Whole Number");
        Scanner input = new Scanner(System.in);
        int num =  input.nextInt();
        boolean flag = false;
        if( num != 1) {
            for (int i = 2; i <= num / 2; ++i) {
                // condition for non-prime number
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }
        } else {
            flag = true;
        }
        if (flag == false) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }


        //------------break keyword example-------
        for (int i = 0; i < 10; i++){
            if (i==4){
                break; // just stop at 4, the result will be 0 1 2 3
                //if we use continue, we will skip 4, until 9. the result should be 0 1 2 3 5 6 7 8 9
            }
            System.out.println(i); // you can use i many times you want in one class if you are using loops.
        }

        //--------while loop-------------the same purpose with for. when the syntax is easier than in for loop we use while.
        int i = 0;
        while (i <= 10){
            System.out.println(i + " Welcome to Java");
            i ++;
        } //body after while. put initial first. not same as for.


        //----------do while loop ------- will execute at least one time
        int y = 0;
        do {
            System.out.println(y);
            y++;
        } while (y < 10); //in this do while, the body before while, so we can use {} behind while.


    }
}
