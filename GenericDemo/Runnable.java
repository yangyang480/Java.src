package GenericDemo;

public class Runnable {
    public static void main(String[] args)
    {
        // call the generic
        G_Data obj1 = new G_Data(); //create an object
        obj1.setVarName("yangyang"); //we can pass anytype of data.
        System.out.println(obj1.getVarName());
        obj1.setVarName(5);
        System.out.println(obj1.getVarName());


        //bound type or type safety or constructor bound type or class level bound type.
        // we can only use wrapper Datatype and any reference class
        G_Data<String> obj2 = new G_Data<String>(); // we can only pass the string type of value
        obj2.setVarName("Twantwan");
        G_Data<Integer> obj3 = new G_Data<Integer>();
        obj3.setVarName(29);

        System.out.println("======you can also pass the custom class. because the class we created can use as datatype===========");
        // but we can also pass the object of this class
        StudentService s1 = new StudentService();
        G_Data<StudentService> obj4 = new G_Data<StudentService>();
        obj4.setVarName(s1); //we are passing the whole object to the this memory.
        s1.setRollNumber(0011);
        s1.setStudName("Pearson");

        // how to call multiple Generic, and just declare the value in the object we create(default value). or we can still do the old way
        G_multiplevariable myObj1 = new G_multiplevariable(111, "yangyang");
        myObj1.setV1(29);//change the default value

        G_multiplevariable myObj2 = new G_multiplevariable();
        myObj2.setV1("Kyle");
        myObj2.setV2(31);
        myObj2.printBothVariable();  //we will get v1: kyle v2: 31

        G_multiplevariable<Integer, String> myObj3 = new G_multiplevariable<Integer, String>();//we can only pass the same
        myObj3.setV1("Kai");
        myObj3.setV2(30);
        myObj3.printBothVariable();


    }
}
