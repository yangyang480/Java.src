package if_loops;

public class Switch {
    public static void main(String[] args) {
        //break keyword is used to terminate the case statememt.
        int number = 18;
        switch (number)
        {
            case 10:
                System.out.println("case 10 is running");
                break;
            case 20:
                System.out.println("case 20 is running");
            case 30:
                System.out.println("case 30 is running");
                break;
            default:
                System.out.println("not in case 10, 20, 30");
        }
    }
}
