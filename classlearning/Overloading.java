package classlearning;

public class Overloading {
    // private or protected variables first
    private int a;
    private int b;
    private int c;
    private double result;

    // at least 2 construtocs
    public Overloading (){

    }
    public Overloading(int a, int b , int c){

    }

    // declare method without arugument
    public void addingnumber(){

    }
    // declare method with 2 aruguments, same method name but the parameters are different.
    public void addingnumber(int a, int b ){
        this.c = a + b; // we are passing the a b numbeer to here from the object class.
    }

    public int getC() {
        return this.c;
    }

    public void addingnumber(double a, int b ){ // we can use widening casting here.

    }

    public void addingnumber(int [] x){ //we can also use inline arugument by using "int...x"
        // for loops can be use here
        for (int i: x){
            System.out.println(i);
        }
    }

    public void addingnumber(String name, int...y){
        for (int i : y){
            System.out.println(i);
        }
        System.out.println(name);
    }

}
