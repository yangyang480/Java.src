package homework;

import java.util.Scanner;

public class YangyangPearsonConditional {
    public static void main(String[] args) {

        //1.
        int x = 7;
        if (x < 10){
            System.out.println("Less than 10");
        } // print out Less than 10.
        int x1 = 15;
        if (x1 < 10){
            System.out.println("Less than 10");
        } // display nothing.


        //2.
        int x2 = 7;
        if (x2 < 10){
            System.out.println("less than 10");
        } else{
            System.out.println("Greater than 10");
        } //display Less than 10
        int x3 = 15;
        if (x3 < 10){
            System.out.println("less than 10");
        } else {
            System.out.println("Greater than 10");
        } //display Greater than 10.


        //3.
        int x4 = 15;//50
        if (x4 < 10){
            System.out.println("Less than 10");
        } else if (x4 >10 && x4 < 20){
            System.out.println("Between 10 and 20");
        } else if (x4 >= 20) {
            System.out.println("Greater than or equal to 20");
        } // between 10 and 20, if change x4 to 50, then the result is Greater than or equal to 20.


        //4.
        int x5 = 15;//50
        if (x5 < 10 || x5 > 20){
            System.out.println("Out of range");
        } else {
            System.out.println("In range");
        } //In range. if change x5 to 50, then the result is out of range.


        //5.
        System.out.println("Please enter your marks: ");
        Scanner a = new Scanner(System.in);
        int marks = a.nextInt();
        if (marks >= 90 && marks <= 100){
            System.out.println('A');
        } else if (marks >= 80 && marks <= 89){
            System.out.println('B');
        } else if (marks >= 70 && marks <= 79){
            System.out.println('C');
        } else if (marks >= 60 && marks <= 69){
            System.out.println('D');
        } else if (marks < 60){
            System.out.println('F');
        } else{
            System.out.println("Score out of range");
        }


        //6.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }

    }
}
