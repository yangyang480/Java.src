package Arraylist;

import java.util.ArrayList;

public class StudentController {

    //variables
    int[] id = {101, 102, 103, 104, 105, 106};
    String[] name = {"java", "math", "language", "chinese", "english", "angule"};

    //method

    public ArrayList<StudentService> pullStudentinfo() //the return type is not void anymore.is arraylist<>, the object we created.
    {
        ArrayList<StudentService> stlist = new ArrayList<>();
        for (int i = 0; i < id.length; i++)
        {
            //object
            StudentService stObj = new StudentService();
            stObj.setRollNumber(id[i]);
            stObj.setStudName(name[i]);
            stlist.add(stObj); // add this object to the stlist object
        }
        return stlist;

        // we set our info here, then we need to get the info too. we will get the info in the studentworking class.
    }
}
