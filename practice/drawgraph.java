package practice;

public interface drawgraph extends Sweet {

    //In Interface variables are by default or implicitly public, static and final
    String NAME = "MyShape"; //we don't need to say public or abstract, by default is public static final
    //interface only have abstract method
    //abstract metohd by default public abstract
    void drawShape(String color); // we dont need to say public abstract
    void drawOn_Xaxis(int x);
    void drawOn_Yaxis(int y);


    //how to call the interface to child class?
    // by using implements keyword
    //we can use more than one interface but you cant extend more than one class use ,
    //when we implements the interface class in child class, we need to implement all the methods we create in the interface class to there.


    //When to use interface when to use inheritance?
    //if you have login you can use interface. in DAO

}
