package execptiondemo;

public class Throw_Throws {

    public void checkEligibility(int studAge, double studGpa)
    {
        //thorw us inside of the method body
        if(studAge < 18 && studGpa < 2){
            // you can use any exceptions
            throw new ArithmeticException("Student is not old enough");
            //you can't throw more than one excettion.
            //mostly we use throw keword to throw custom exception. you can define you own rules or message.
        }
        else
        {
            System.out.println("you can login");
        }
    }
}
