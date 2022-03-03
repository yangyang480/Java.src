package practice;

public class Circle extends Shapeclass{

    final double PI = Math.PI;
    private double radius;

    //constructor
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    //implementation all the methods from parents
    @Override
    protected double area() {
        double areaResult = PI * Math.pow(this.radius, 2);
        return areaResult;     //we need to put logic here
    }

    @Override
    protected double volume() {
        return 0;
    }

    @Override
    protected double perimeter() {
        return 0;
    }
}
