package class_wrapper_math;

public class StringObject {
    public static void main(String[] args) {

        String st = "Welcome"; // Literal
        System.out.println(st);
        //String is unchangeable.
        String st_result = st.replace("Welcome", "java");
        System.out.println(st_result);

        String st1 = new String("Welcome to"); // new operator to create a object class
        System.out.println(st.concat(st1));
        System.out.println(st.charAt(0)); // which char you are getting in the string, 0 in this example will be w.
        System.out.println(st.indexOf('o')); // the specific char is matching which index, should be 4th char.
        System.out.println(st.lastIndexOf('e')); // returns what is the last char's position. should be in 6th position in this example.

        String a = "yang";
        String b = "yangyang";
        System.out.println(a.compareTo(b)); //if different return value will convert to the unicode so will be number -4  ???
        System.out.println(a.equals(b)); // should be false
        System.out.println(st.substring(0,4));

        //convert from string to number
        String stNum = "20";
        int pint = Integer.parseInt(stNum); // return primitive datatype
        double pint1 = Double.parseDouble(stNum); //
        Integer nonpint = Integer.valueOf(stNum); // return non primitive datatype
        System.out.println(pint);
        System.out.println(pint1);
        System.out.println(nonpint);

            // convert number to string
        Integer d = 30;
        String numberResult = d.toString();
        System.out.println(numberResult);
        Double dd = 30.33;
        String abcd =  dd.toString();
        System.out.println(abcd);

    }
}
