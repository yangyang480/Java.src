package class_wrapper_math;

public class WrapperClass {
    public static void main(String[] args) {

        //wrapper class(they are reference class too) --> Boolean, Character, Byte, Short, Integer, Long, Float, Double
        // wrapper class is a class whose object wraps or contains primitive data type
        // you can relate wrapper class with datatype.
        int i =1; // primitive, datatype, i is variable
        Integer ii =1; // non-primitive type, wrapper class,  ii is object.  then we can create a object class. without new keyword,we call it literal method.
        Integer iii = new Integer(1); // one way to create object class by using new. we call it new operator.



        // references Class --> String, Scanner, Array they are point to value.
        // any reference class can create object class by using new keyword. cannot create object class without new keyword. but Wrapper class can.


         //auto boxing is from primitive type to wrapper class
        int a = 20;
        Integer aObj = a; // convert form datatype to wrapper class. meaning aObj this object is holding the value of a.
        System.out.println(aObj.compareTo(20));
        //unboxing
        int aa = aObj; // meaning aa = the value whatever aObj holds.
        //Object will store in heap memory, the variable will store in the stack memory.
    }
}
