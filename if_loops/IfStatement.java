package if_loops;

public class IfStatement {
    public static void main(String[] args) {
        // if and if else statements are used to test the conditions.
        // it check boolean condition: true or false.
   /*    if (condition)
        {
            body, body will excute if condition is ture.
        }
        else if(condition)
        {
            //body,
        }
        else {
        //body
        }
*/

        int age = 20;
        if (age > 30){
            System.out.println("you can have beer");
        }
            else if (age >= 20 && age <= 30) {
            System.out.println("you almost there");
        } else {
            System.out.println("sorry, you cannot drink");
       }

        //if statements can be nested too.
        int weight = 150;
        int myage = 20;

        if( myage > 18) {
            if (weight > 140) {
                System.out.println("you are eligible to login");
            } else {
                System.out.println("you are not eligible to login");
            }
        } else {
                System.out.println("you are under age");
            }


    }
}
