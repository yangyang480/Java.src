package employees_homework;

public class InheritanceActivity {
    public static void main(String[] args) {
        // call overload constructor and set the value.
        Manager m = new Manager(126534l, "Peter", "Chennai India", 237844l, 65000);

        // call the method and printed out.
        double salary = m.calculateSalary();
        System.out.println(salary);

        Trainee t = new Trainee(29846l, "Jack", "Mumbai India", 442085l, 45000);
        double salary1 = t.calculateSalary();
        System.out.println(salary1);

        //call the allowance method
        double transallowanceform = m.calculateTransprotAllowance();
        System.out.println(transallowanceform);


        System.out.println(t.calculateTransprotAllowance());
    }
}
