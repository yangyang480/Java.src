package execptiondemo;

public class main {
    public static void main(String[] args) throws CustomException {
        throw new CustomException("this is my error");


        //==========second way to handle the exception.
        /*try
        {
            throw new CustomException("this is my erroe");
        }
        catch(CustomException e)
        {
            System.out.println(e);
        }
         */
    }
}
