package execptiondemo;

public class CustomException extends Exception{
    // 1. we can extand from exception class, since it is super class
    // 2. create a constructor of this class and pass only one parameter to constructor with super keyword
    CustomException(String str)
    {
        super(str);
    }

    //custom exception we create is checked exception, we can handle it by using try-catch/ throws.

}
