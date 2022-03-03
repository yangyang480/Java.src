package classlearning;

import org.w3c.dom.ls.LSOutput;

public class ClassStudy {
    int a; // class variable, you can use anywhere in this class. you don't have to initialize the vaule since they have default value.
    public static void main(String[] args) {
         int a = 1; //local variable you can only use this variable inside of this method. when you declare the local variable you have to initialize the value.

        Shape spobj = new Shape(); //this is useing the constructor will create a contryctor auto in the shape class if we don't create it.
        Shape spobj1 = new Shape(2.5,52.3);
        Shape spobj3 = new Shape(2.0, 55.0, "yangyang");


        spobj.setwidth(25.3);
        spobj.setHeight(63.3);
        System.out.println(spobj.getPerimeter()); //getting 0.0 since we use defalut value for this.

        Overloading mObj = new Overloading(); // we are createing the object class. name same as the class name.
        mObj.addingnumber(25.5, 25); // we haven't set the relationship yet
        System.out.println(mObj.getC());

        System.out.println("==================================================");

        int [] x = {1, 2, 3, 4, 5};
        mObj.addingnumber(x);
        mObj.addingnumber("hello", x);

        System.out.println("==================================================");

        StaticKeyword st1 = new StaticKeyword();
        StaticKeyword st2 = new StaticKeyword();
        StaticKeyword st3 = new StaticKeyword();
        StaticKeyword st4 = new StaticKeyword();
        StaticKeyword st5 = new StaticKeyword();

        st1.var1 = 100;
        st2.var1 = 200;
        st3.var1 = 300;
        st4.var1 = 400;
        st5.var1 = 500;

        System.out.println(st1.var1);
        System.out.println(st2.var1);
        System.out.println(st3.var1);
        System.out.println(st4.var1);
        System.out.println(st5.var1);  //all of them will be 500, because of the static words.

        st1.var2 = 2;
        st2.var2 = 3;
        st3.var2 = 4;
        st4.var2 = 5;
        st5.var2 = 6;

        System.out.println(st1.var2);
        System.out.println(st2.var2);
        System.out.println(st3.var2);
        System.out.println(st4.var2);
        System.out.println(st5.var2); //every single result will be different.

        System.out.println("==================================================");

        savingaccount svobj = new savingaccount(10, "haseeb",100);
        savingaccount svobjTwo = new savingaccount(11, "John",200);
        savingaccount svobjThree = new savingaccount(12, "Fink",5000);

        System.out.println(svobj.getBalance());
        svobj.setDeposite(400);
        System.out.println(svobj.getBalance());
        svobj.setwithDraw(200);
        System.out.println(svobj.getBalance());
        double intrate =   svobj.caulateInterest();
        System.out.println(intrate);
        System.out.println("==================================================");









    }

}
