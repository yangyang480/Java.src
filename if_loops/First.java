package if_loops;

public class First {

    public static void main (String[] args) {

      int year = 2022;
      boolean isleapyear = (year % 4 ==0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year  +" --> "+ isleapyear);

        int x = 3;
        int y = 4;
        System.out.println(x | y); // 3 is 0011, 4 is 0100, using | or then is 0111, is 7
        System.out.println(x & y); // 0011 & 0100 = 0000  is 0
        System.out.println(x >> 1); //3 is 0011 right shift to 1 is 0001 that is 1  shift is you put o into the bit counting
        System.out.println(x << 1); // oo11 left shift 1 is 0110 then is 6
        System.out.println(~x); // x=3= 0011, not 0011 then is 1100 = 12  ???
    }
}
