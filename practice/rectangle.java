package practice;

public class rectangle extends Shapeclass{ //abstract and then need to bring all the methods in the parents class
    //don't need abstract keyword in the class name anymore
    private double width;
    private double height;

    //two constructors
    public rectangle(){

    }
    public rectangle(double w, double h){
        this.height = height;
        this.width = width;
    }
@Override
protected double area() {
    double areaResult =  this.width * this.height;
    return  areaResult;      //we need to put logic here
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
