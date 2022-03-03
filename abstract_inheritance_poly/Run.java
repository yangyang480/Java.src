package abstract_inheritance_poly;

public class Run {
    public static void main(String[] args) {

        circle c = new circle(100); // we need to set the value to the radius by using the an object ?
        System.out.println("Circle Area: " + c.area()); //then sout

        //also we can change the value by using set. but first we have to put get method in the child.
        c.setRadius(20.0); // to set value we use () instead of =
        //then we can sout again
        System.out.println("Circle Area: " + c.area()); //then i will get the different result.

    }
}
