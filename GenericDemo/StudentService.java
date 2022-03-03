package GenericDemo;

public class StudentService {

    private int rollNumber;
    private String studName;

    //constructors
    public StudentService()
    {

    }
    public StudentService(int rollNumber, String studName)
    {
      this.rollNumber = rollNumber;
      this.studName = studName;
    }

    //set getter ans setter
    public int getRollNumber()
    {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber)
    {
        this.rollNumber = rollNumber;
    }

    public String getStudName()
    {
        return studName;
    }

    public void setStudName(String studName)
    {
        this.studName = studName;

        //we can wait to be called
    }
}
