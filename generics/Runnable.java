package generics;

public class Runnable {
    public static void main(String[] args) {

        // we can pass as much values as i want.
        G_methodDemo gObj = new G_methodDemo();
        gObj.genericmethod("Haseeb");
        gObj.genericmethod(25.36);
        gObj.genericmethod(true);
        gObj.genericmethod(25.3f);

        gObj.mymethod(2.36);
        //  gObj.mymethod("haseeb");

        System.out.println("'==== GENERIC  CLASS DEMO====");

        Gen_ClassDemo ObjOne = new Gen_ClassDemo("Haseeb");
        System.out.println(ObjOne.getVarOne());
        ObjOne.setVarOne(5);
        System.out.println(ObjOne.getVarOne());


        Gen_ClassDemo ObjTwo = new Gen_ClassDemo(25896.36);
        System.out.println(ObjTwo.getVarOne());
        Gen_ClassDemo Objthree = new Gen_ClassDemo(2563);
        System.out.println(Objthree.getVarOne());

        String[] fruitNames = {"Apple", "Oranges", "Mango"};
        ObjOne.printArray(fruitNames);

        Integer[] StudentRollNumber = {25,26,2,7,28,29};
        ObjOne.printArray(StudentRollNumber);


    }
}
