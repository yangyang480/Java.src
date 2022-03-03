package polydemo;

public class cat extends Animal{
//compiler create default constructor without arguments
    @Override
    public void animalsound() {
        System.out.println("The cat says: Meow");
    }

    @Override
    public void animalfood() {

    }

    @Override
    public void animalfood(String name) {

    }
}
