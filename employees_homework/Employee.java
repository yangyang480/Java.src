package employees_homework;

public class Employee {



        // declare variables
        long employeeId;
        String employeeName;
        String employeeAddress;
        long employeePhone;
        double basicSalary;
        double specialAllowance = 250.80;
        double Hra = 1000.50;



        //create overloaded constructors & initialize them
        protected Employee(long Id, String Name, String Address, long Phone, double basicSalary){
            this.employeeId = Id;
            this.employeeName = Name;
            this.employeeAddress = Address;
            this.employeePhone = Phone;
            this.basicSalary = basicSalary;
        }

        // create a method
        protected double calculateSalary()
        {
            double salary = basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * Hra/100);
            return salary;
        }

        // add a method
        protected double calculateTransprotAllowance()
        {
            double transportAllowance = (double)10/100 * basicSalary;
            return transportAllowance;
        }

}
