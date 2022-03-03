package classlearning;
//when you create a object class, become to parent class auto
//class declare only once, the object class declared several times.
public class Shape {
    // don't need to create main methods can reuse the other main class
    // global variable or class variable, because there is no defined method in this class.
    //fielda can be access anywhere within the class.
    private double width;  // by default the value is 0 //these are variables also called fields
    private double height;   // also be private to use getter and settles
    private String name; // by defualt the value is  null
    protected double area;

    public Shape(){

    }

    public Shape(double width, double height){
        this.width = width;
        this.height = height;
    }

    public Shape(double width, double height, String name){ //this constrouctor has three arguments
        this.width = width;
        this.height = height;
        this.name = name;
    }
    // we can create methods or constructor by the same name , but both they have to have different number arguments or different datatype.
    // this is called overloading.


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter(){
        return 2.0*(this.height + this.width);
    }

    public void setwidth(double v) {

    }

}
