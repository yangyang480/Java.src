package homework;

import java.security.spec.RSAOtherPrimeInfo;

public class YangyangPearsonLoops {
    public static void main(String[] args) {

        //1.
        System.out.println("\n\n1:");
        for (int i = 1; i < 11; i ++){
            System.out.println(i);
        }
        
        
        //2.
        System.out.println("\n\n2:");
        int i = 0;
        while (i <= 100){
            System.out.println(i);
            i += 10;
        }


        //3.
        System.out.println("\n\n3:");
        int x = 1;
        do {
            System.out.println(x);
            x ++;
        } while (x < 11);


        //4.
        System.out.println("\n\n4:");
        for (int ii = 1; ii <= 100; ii ++) {
            if (ii % 5 == 0) {
                if (ii > 25 && ii < 75)
                    continue;
                System.out.print(ii + ", ");
            }
        }


        //5.
        System.out.println("\n\n5:");
        for (int a = 1; a <= 100; a ++){
            if (a % 5 == 0) {
                System.out.println(a);
                if (a > 45)
                    break;
            }
        }


        //6.
        System.out.println("\n\n6:");
        for (int w =1; w < 3; w ++){
            System.out.println("Week " + w + ": ");
            for (int d = 1; d < 6; d++){
                System.out.println("Day " + d);
            }
        }


        //7.
       System.out.println("\n\n7:");
       for (int p = 10; p < 200; p ++){
           int length = String.valueOf(p).length();
           int left = p / (length == 2 ? 10 : 100);
           int right = p % 10;
           if (left == right) {
               System.out.print(p + ", " );
           }
        }


       //8.
        System.out.println("\n\n8:");
        int max = 50;
        int num1 = 0;
        int num2 = 1;

        while(num1 <= max) {
            System.out.print(num1 + ", ");
            int previousTwo = num1 + num2;
            num1 = num2;
            num2 = previousTwo;
        }


        //9.
        System.out.println("\n\n9:");
        for (int ii = 0; ii < 3; ii ++){
            for (int j = 0; j < 3; j ++)
            System.out.println("Inner loop: i: " + ii + ",j: " + j);
        }
    }
}
