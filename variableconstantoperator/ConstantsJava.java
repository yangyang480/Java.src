package variableconstantoperator;

import java.math.BigDecimal;

public class ConstantsJava {

    public static void main(String[] args) {
        final double PI = 3.14;
        final int MYSSN = 123456; //if using final then the name should be all uppercase.

        System.out.println(MYSSN);


//primitive datatype:
byte gamebay = 5;
long longgame = 4567l; //have to has l in the end. l / L both work

float floatgame = 224.567f;
float gdygame = 25/10;

double dougame = 345.466;
double dougwgdVar2 = 132/56; //save more memory rather than float

char mtchar = 'D';
char mychar = '\u0058'; //you can also use unicode // this is like using mosimima, this unicode means 'X'


    //wideing casting (auto type conversion) --> conver a smaller type size to a larger one.
byte bytvar = 5;
short s = bytvar;
long l = s;

     //marrow type casting
        // double --> float --> long --> int --> short --> byte  the reasult will be truncate
        double dtzx = 2345.764;
        byte shttx = (byte) dtzx;

        System.out.println(shttx);

        byte bex = 42;
        short cex = 1023;
        float fex = 23.4f;
        double des = 0.24;

        double result = (bex*cex) + (fex/des);


        //------- Non primitive data type/reference data type -----object class is a class we can use object as a datatype


        String st = "Hello String";// st. you will see all the method in string class.

        byte b = 127;
        System.out.println("Byte b = " + b); //127
        short ss = 128;
        b = (byte) ss;
        System.out.println("Byte b = " + b); //-128 you are losing data if you convert from big to small type

    }
}