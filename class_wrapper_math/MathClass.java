package class_wrapper_math;

public class MathClass {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        // we cannot create an object of Math class by using new operator because math class has static methods.
        int z = Math.max(x,y);  // return integer meaning which number is max number
        System.out.println(z); // should be 10

        double zz = Math.sqrt(y); // what is sqrt? pingfang
        System.out.println(zz); // should be 2.0
        System.out.println(Math.log(x));
        System.out.println(Math.log10(10)); // should be 1
        System.out.println(Math.pow(2,3)); //should be 8 2de 3cifang

        double d = 83.67;
        System.out.println(Math.ceil(d)); // 84.0
        System.out.println(Math.floor(d)); // 83.0
        System.out.println(Math.rint(d)); // 84.0
        System.out.println(Math.round(d)); // round of the decimal to the nearest value. get integer. 84


        double c = 90;
        System.out.println(Math.toRadians(c)); // convert degree to radians. hudu

        System.out.println(Math.random()); //0.0 to 1.0
        double randValue = Math.random();
        System.out.println(Math.random()*60); //you can utilize them with + - * / %
        // you can also casting to different datatype

        double multinumberRan = randValue * 60; // the number generate should between 0 - 59
        System.out.println(multinumberRan);
        int randumnumberinteger = (int)(multinumberRan); // narrow casting
        System.out.println(randumnumberinteger);

        System.out.println("========lianxi=====");
        int a = 10;
        double result = Math.random()* a;
        System.out.println(result);
        System.out.println(Math.exp(a));

        byte newresult = (byte)(a);
        System.out.println(newresult); // narrow casting

    }
}
