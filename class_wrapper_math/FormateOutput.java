package class_wrapper_math;

public class FormateOutput {
    public static void main(String[] args) {
        String message = "Hello User, you order was placed. Total amount is 600 and Tax is 2.5";
        int orderamount = 600;
        float tax = 2.5f;
        String username = "yang";
        System.out.println(message);
        System.out.format("Hello %s, you order was placed. Total amount is %d and Tax is %f", username, orderamount, tax);
        System.out.printf("");
    }
}
