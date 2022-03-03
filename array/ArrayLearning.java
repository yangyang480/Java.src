package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLearning {
    public static void main(String[] args) {

        // Array is referenced class, meaning array is also objects. is collection of the same datatype.
        //1. declare the array, have to have datatype [] = new datatype [size]. two ways to declare.
        int[] a = new int[10];// recommended way to declare int. a here is an object name.[10] is how many values/elements can store in memory. index number start from 0. length start from 1.
        int b[] = new int[10];
        // in the array you cannot change the datatype and the size of array.
        // you don't have to declare the size at the first place when you use it you need to declare.
        Object[] obj; // we can declare a array of objects too. in the object we can put primitive datatype.

        //2. initializing the values
        a[0] = 10;
        a[1] = 20; //the size of value you put down here must match the size
        // you can declare and initialize the value at the same time on array.
        int[] c = {11, 22, 33, 44, 55}; //the size is 5.
        int[] d = new int[c.length]; // array will create 6 size, but no values.
        //----you can also put the array in a loop------
        for (int i = 0; i < 10; i++) { // you can also use a.length replace the size here which is 10.
            System.out.print("At index " + i + " --> ");
            System.out.println(a[i] = 10 + i);
        }

        //3.enhance loop also called for-each loop
        int[] e = {11, 22, 33, 44, 55};
        for (int myarray : e) {
            System.out.println(myarray);
        }

        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }

        // Arrays is a class, have a lot of methods. since it is a class, we don't need to do a object to use the methods, we can just use the methods directly. '


        //--------------copying elements from arrays by using =  ----------will change both array-----------
        int[] listone = {1, 2, 3, 4, 5, 6};
        int[] listtwo = listone;

        listone[5] = 100; // it changed listone and also listtwo.

        System.out.println(Arrays.toString(listone)); //[1, 2, 3, 4, 5, 100]
        System.out.println(Arrays.toString(listtwo)); //[1, 2, 3, 4, 5, 100]

        if (listone == listtwo) {
            System.out.println("same instance or memory location");  //same instance or memory location
        } else {
            System.out.println("different instance or memory location");
        }


        //----------copying array by using loop-------------------once anyone change will change the whole thing-----
        int sourceArray[] = {1, 2, 3, 4, 5, 6};
        int targetArray[] = new int[sourceArray.length];

        for (int i = 0; i < targetArray.length; i++) {
            targetArray[i] = sourceArray[i];
        }
        System.out.println(Arrays.toString(targetArray)); // [1, 2, 3, 4, 5, 6]

        //-----------------copying array by using clone ----------only output after will change----------
        int[] cloneArray = sourceArray.clone();
        System.out.println(Arrays.toString(cloneArray)); //[1, 2, 3, 4, 5, 6]
        cloneArray[4] = 200;
        System.out.println(Arrays.toString(cloneArray)); //[1, 2, 3, 4, 200, 6]

        //---------System. copy array() ---------------copy specify portion of array---------this is come from System class------
        int[] n1 = {2, 3, 4, 5, 6};
        int[] n2 = new int[n1.length];

        System.arraycopy(n1, 2, n2, 1, 2); //copy n1 to n2, start from index 2 in n1, give it to n2 index 1, copy 2 indexs total.
        System.out.println("n2 --> " + Arrays.toString(n2)); // n2 --> [0, 4, 5, 0, 0]


        //----------------------------Array.copy --------------this is from Arrays class----------------
        int[] list3 = {1, 2, 4, 5, 6, 8, 10};
        int[] list4 = Arrays.copyOf(list3, 20);

        System.out.println(Arrays.toString(list4)); //[1, 2, 4, 5, 6, 8, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        list4[9] = 100;
        System.out.println(Arrays.toString(list4)); //[1, 2, 4, 5, 6, 8, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100]
        System.out.println(Arrays.toString(list3)); //[1, 2, 4, 5, 6, 8, 10] list3 won't change,because list3 the size only has 7 size.

        //----------initializing values from user input -----------------
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number for Array Initialization");
        int arraysize = sc.nextInt();
        String[] data = new String[arraysize];
        sc.nextLine();
        System.out.println("Enter Your full name");
        String name = sc.nextLine();

        System.out.println("Enter your UserName");
        String Username = sc.nextLine();

        System.out.println("Enter you Password");
        String password = sc.nextLine();

        System.out.println("Enter you phone number");
        int phone = sc.nextInt();

        data[0] = name;
        data[1] = Username;
        data[2] = password;
        data[3] = Integer.toString(phone);

        System.out.println(Arrays.toString(data));

        //-------------Arrays.fill---------------------
        long[] lValues = new long[500];
        Arrays.fill(lValues, 2000);
        System.out.println(Arrays.toString(lValues)); //all 500 elements will return the same value of 2000.


        //---------max number---------------
        int arr[] = {10, 30, 50, 67, 98};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);


        //-------reverse------------
        int[] n3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverseArray = new int[n3.length];
        for (int i = 0; i < n3.length; i++) {
            reverseArray[n3.length - 1 - i] = n3[i];
            // 1 -->
            // reverseArray[10,9,8,7,6,5,4,3,2,1]
            // reverse[10] --> 1
            // reverse[9] --> 2
        }
        System.out.println(Arrays.toString(reverseArray));


        //-----------------Array deletion and insertions---------------you can't delete anything in array, but you can shavel.
        int arr1[] = {45, 67, 77, 88, 99, 22};
        int removeelement = 0; //index 0 which is 45.
        for (int i = removeelement; i < arr1.length - 1; i++) {
            arr1[i] = arr1[i + 1];
        }
        System.out.println(Arrays.toString(arr1)); //[67, 77, 88, 99, 22, 22]


        //----------------------Arrays.sort-------------
        int[] unsortedArray = {2, 1, 5, 4, 24, 7, 9, 8};
        Arrays.sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray)); //[1, 2, 4, 5, 7, 8, 9, 24]


        //--------------------------------2d arrays ---------------
        int[][] myarray = new int[][]
                {
                        {45, 67, 77, 88},
                        {10, 9, 8, 7},
                        {23, 45, 56, 77}
                };
        System.out.println(myarray.length);// you can get the length of column by using length.
        System.out.println(myarray[0].length);// if you want to get the specific row's length, by using index number, we are getting the first row's length.
        System.out.println(myarray[1][3]); //first specify the row and second specify the column. you can get to specify value you want.
        //you can also put this in a loop-to print all the elements-------------------
        for (int i = 0; i < myarray.length; i++) {
            for (int j = 0; j < myarray[i].length; j++) {
                System.out.println(myarray[i][j] + ",");
            }
        }
        



    }
}
