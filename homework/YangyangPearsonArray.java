package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class YangyangPearsonArray
{
    public static void main(String[] args)
    {

        System.out.println("==============1===============");
        int[] a = {1, 2, 3};
        for ( int mya : a)
        {
            System.out.println(mya);
        }

        System.out.println("==============2===============");
        int[] b = {13, 5, 7, 68, 2};
        System.out.println(b[2]);

        System.out.println("==============3===============");
        String[] color = {"red", "green", "blue", "yellow"};
        System.out.println(color.length);
        String[] copy = color.clone();
        System.out.println(copy);
        System.out.println(Arrays.toString(copy));

        System.out.println("==============4===============");
        int[] c = new int [5];
        System.out.println(c[0]);
        System.out.println(c[c.length-1]);
        System.out.println(c.length);
        //System.out.println(c[5]);  //ArrayIndexOutOfBoundsException


        System.out.println("==============5===============");
        int[] y = new int[5];
        for (int i = 0; i < 5; i++)
        {
            y[i]=i;
            System.out.println(Arrays.toString(y));
        }

        System.out.println("==============6===============");
        int[] d = new int[5];
        for (int i = 0; i < 5; i++)
        {
            d[i] = i*2;
            System.out.println(Arrays.toString(d));
        }


        System.out.println("==============7===============");
        int[] e = {3, 6, 9, 12, 15};
        for (int i = 0; i < 5; i++)
        {
            if (i !=2)
                System.out.println(e[i]);
        }


        System.out.println("==============8===============");
        String[] f = {"Yang", "Twan", "Anthony", "Kai", "Kyle"};
        String temp = f[0];
        f[0] = f[f.length/2];
        f[f.length/2] = temp;
        System.out.println(Arrays.toString(f));


        System.out.println("==============9===============");
        int[] x = {4, 2, 9, 13, 1, 0};
        Arrays.sort(x);
        System.out.println(Arrays.toString(x));
        System.out.println(x[0]);
        System.out.println(x[x.length-1]);


        System.out.println("==============10===============");
        ArrayList<Object> myarray = new ArrayList<Object>();
        myarray.add(1);
        myarray.add("Hi");
        myarray.add("Hello");
        myarray.add("Bye");
        myarray.add(2.0);
        for (Object o : myarray)
        {
            System.out.println(o);
        }

    }
}
