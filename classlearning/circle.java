package classlearning;

public class circle extends Shape { //circle is child, shape is parent

    private double radius;
    private final double PI = Math.PI;

    //two constructor
    public circle(double radius){
        this.radius = radius;
    }
    public circle(){

    }

    public double findarea(){
        area = PI * Math.pow(this.radius, 2);
        return area;
    }
}
