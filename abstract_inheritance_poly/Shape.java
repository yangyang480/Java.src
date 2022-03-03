package abstract_inheritance_poly;

public abstract class Shape {

    //double area1;//this is variables. we need to give them protected, and then make them to abstract method.
    protected abstract double area(); // since abstract method only in abstract class. so we need to make it abstract class.
    protected abstract double volume(); // method we need()
    protected abstract double primeter();

    // now we need to specfy the child by creating new class

}
