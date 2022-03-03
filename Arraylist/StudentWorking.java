package Arraylist;

import java.util.ArrayList;

public class StudentWorking {

    public void displayStudentinfo()
    {
        StudentController con = new StudentController();
        ArrayList<StudentService> sdata = con.pullStudentinfo();
        //get  the data
        for (StudentService showlist : sdata)
        {
            int roll = showlist.getRollNumber();
            String namee = showlist.getStudName();
            System.out.println(roll + " " + namee);
        }
    }
}
