package execptiondemo;

public class Learning
{
    public static void main(String[] args) { //throws FileNotFoundException {
        System.out.println("will executed");

        try
        {
            int a = 100 / 0; //normally will stop here. won't run below code.
            System.out.println("");
            //but it didn't show the error in the coding or before run. this error will show when we execute the code. this is unchecked exception.
            //how to handle unchecked exception?
            //we can use try catch. but is not forced to use.
        }
        catch(Exception e){ // if you know what kind of exception it is, then we can specify the exception after the catch.
            // if you don't know what kind of it is you can use exception.
            System.out.println("dont use 0 in denominater" + e);
            e.getStackTrace();
            // the
        }
        finally
        { // this block is optional, one method can only have one finally.
            // we use this for relaese and close resource
            // this fianlly will always execute, either exception occur or not.
            System.out.println("will always excuted");
        }

/*
        FileReader f = new FileReader("demo.txt");//we get error here, so this is checked execption. we have to use try case or throw keywords.
        //so we put throws keyword on the main method.

        System.out.println("will not executed");

 */
        //catch you can tiaozheng your output, but throws you can't
        // uncheck exception occure because of programmer mistake
        // checked execpetion are attached with some exceptions, in order to handle these execptions, we have to use try catch flow or throws keywords.
        // we can also use if-else, switch case to handle exceptions.



    }
}
