package polydemo;

public class Main {
    public static void main(String[] args) {


        Animal myanimal = new Animal() {
            @Override
            public void animalfood() {

            }

            @Override
            public void animalfood(String name) {

            }
        }; //animal object
        Animal mydog = new dog(); //dog obj
        Animal mycat = new cat(); //cat obj

        myanimal.animalsound();
        mydog.animalsound();
        mycat.animalsound();
        //upcasting upon the class.



    }
}
