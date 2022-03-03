package employees_homework;

public class Manager extends Employee{
    //create constructor
    public Manager(long Id, String Name, String Address, long Phone,double basicSalary)
    {
        super(Id, Name, Address, Phone, basicSalary);
    }

    //overload a method
    public double calculateTransprotAllowance()
    {
        double transportAllowance1 = 15 * basicSalary/100;
        return transportAllowance1;
    }

}
