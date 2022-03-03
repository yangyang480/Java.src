package Arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        System.out.println("=====================arraylist is Generic type class======================");
        ArrayList list1 = new ArrayList(); // will import a package called util.Arraylist // this is not type safty, since we didn't declare any datatype
        list1.add("yangyang");// by using add method we can add values in arraylist
        list1.add(29);
        list1.add(true);
        System.out.println(list1);
        System.out.println(list1.indexOf(29)); //will get the index number of 29 value are.
        System.out.println(list1.remove(0));
        System.out.println(list1); // yangyang should be removed from the list1
        System.out.println(list1.contains(true));//if contains the value then return true, otherwise return false.

        //this is the type safety. so we can only pass the same value of the datatype we declared.
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Twantwan");

        List<String> l = new ArrayList<>(); //since list is parent class of arraylist. so we can use this way.

//====================.add() and asList() are same method=====================
        List listone = Arrays.asList("Anthony", 29);
        List<String> listtwo = Arrays.asList("Kai", "Kyle");

        System.out.println("====================for-each() loop =====================");
        for (String showlist : listtwo)  //for(datatype name : objectname)
        {
            System.out.println(listtwo);
        }
        System.out.println("================== iterators: traveling through Iterator diedaiqi============");
        Iterator<String> itr = listtwo.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("=======List interface=============addall() method can add two lists together ===============");
        List<Integer> primeNumber = new ArrayList<>();
        primeNumber.addAll(Arrays.asList(2,3,4)); // initialize some values
        System.out.println(primeNumber); // the result will be [2, 3, 4]

        primeNumber.addAll(1, Arrays.asList(10, 20));
        System.out.println(primeNumber); // the result will be [2, 3, 10, 20, 4]

        System.out.println("=================set the value inside of the object 1=================");
        ArrayList<StudentService> stlist = new ArrayList<>();  //stlist is an object we created
        StudentService s2 = new StudentService(101, "Yangyang");
        StudentService s3 = new StudentService(102, "Twantwan");
        StudentService s4 = new StudentService(103, "Anthony");
        //we can add those objects s2 s3 s4 to rge stlist object
        stlist.add(s2);
        stlist.add(s3);
        stlist.add(s4);

        for (StudentService showlist : stlist)
        {
            System.out.println(showlist.getStudName() + " " + showlist.getRollNumber()); // we need to speicy what column we want to print out.
        }

        System.out.println("=================set the value inside of the object 2 teacher=================");
        ArrayList<Teacher> tlist = new ArrayList<>();

        Teacher t1 = new Teacher(101, "yangyang", 29);
        Teacher t2 = new Teacher(102, "Dave", 27);
        Teacher t3 = new Teacher(103, "Kath", 39);
        tlist.add(t1);
        tlist.add(t2);
        tlist.add(t3);

        Iterator myItr = tlist.iterator();
        while(myItr.hasNext())
        {
            Teacher t = (Teacher) myItr.next();
            System.out.println(t.getTage() + " " + t.getTid() + " " + t.getTname()); // we will get the memory location. so we need to do type casting to convert
        }

        System.out.println("================important====dnaymic======Studentworking and studentcontroller=============");
        //class

        StudentWorking objj = new StudentWorking();
        objj.displayStudentinfo();

    }
}
