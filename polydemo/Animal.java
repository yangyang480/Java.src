package polydemo;

public abstract class Animal { //this is abstract class

    public void animalsound(){
        System.out.println("The animal make sound for communication");
    }

    public abstract void animalfood();//don't have body
    public abstract void animalfood(String name); //

    public void GetRest(){
        System.out.println("Animal sleep");
    } // you don't have to abstract method if all the children will do the same thing


}
