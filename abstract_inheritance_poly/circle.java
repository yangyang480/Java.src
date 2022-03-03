package abstract_inheritance_poly;

public class circle extends Shape{ //since Shape is abstract class we need pass all the methods here

    // we need to write objects since PI willnot change so we use final keyword
    final double PI = Math.PI;
    private double radius; //this is variable since only this class will use it then we use private keyword

    //next we need two constructors,one have no paraneter another has this is overridng constructors
    public circle (){

    }
    public circle (double radius){ //then we use this key word to link two radius
        this.radius = radius;
    } //since this is child class we need use extends keywrord

// pass all the methods here by click on implements, inside of methods we need to do the logic. which means what we want to get in the results
    @Override
    protected double area() {
        double areaResult = PI * Math.pow(this.radius, 2);
        return areaResult;
    }
    //using getmethod we can use set in main class to change the value.
    //also the get method has return value which means we have to return something
    public double getRadius()
    {
        return radius;
    }
    //after we use get method we still need to use the set method here. reason????
    public void setRadius(double radius)
    { //also since don't have return value, the return type we can just use void.
        //since set doesnt have return value, so we need to use this to speciy which radius we are going to set
        this.radius= radius;
    }//we get set method done, then we can go to main class to set the value.
    @Override
    protected double volume()
    {
        return 0;
    }

    @Override
    protected double primeter()
    {
        return 0;
    }
    //after we get this done we need go to the main class to sout.
}
