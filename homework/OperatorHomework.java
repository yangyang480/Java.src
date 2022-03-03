package homework;

public class OperatorHomework {

    public static void main(String[] args) {

 /*       1. Write the following integers in binary notation.
•	1  1
•	8  1000
•	33  1000 01
•	78  1001 110
•	787  1100 0100 11
•	33,987  1000 0100 1100 0011
*/

  /*      2. Convert the following binary numbers to decimal notation.
•	0010  2
•	1001  9
•	0011 0100 52
•	0111 0010  114
•	0010 0001 1111  543
•	0010 1100 0110 0111  11,367
*/
        // 3.
        int x = 2;
        System.out.println(Integer.toBinaryString(x)); //decimal should be 2, output should be 10
        System.out.println(Integer.toBinaryString(x << 1)); //decimal should be 4, output should be 100

        int a = 9;
        System.out.println(Integer.toBinaryString(a)); //decimal should be 9, binary should be 1001
        System.out.println(Integer.toBinaryString(a << 1)); //decimal should be 18, binary should be 10010

        int b = 17;
        System.out.println(Integer.toBinaryString(b)); //decimal should be 17, binary should be 10001
        System.out.println(Integer.toBinaryString(b << 1)); // decimal should be 34, binary should be 100010
        
        int c = 88;
        System.out.println(Integer.toBinaryString(c)); //decimal should be 88, binary should be 1011000
        System.out.println(Integer.toBinaryString(c << 1)); //decimal should be 176, binary should be 10110000

        // 4.
        int xx = 150;
        System.out.println(Integer.toBinaryString(xx)); //decimal should be 150, binary should be 10010110
        System.out.println(Integer.toBinaryString(xx >> 2)); //decimal should be 37, binary should be 100101

        int aa = 225;
        System.out.println(Integer.toBinaryString(aa)); //decimal should be 225, binary should be 11100001
        System.out.println(Integer.toBinaryString(aa >> 2)); //decimal should be 56, binary should be 111000

        int bb = 1555;
        System.out.println(Integer.toBinaryString(bb)); //decimal should be 1555, binary should be 11000010011
        System.out.println(Integer.toBinaryString(bb >> 2)); //decimal should be 388, binary should be 110000100

        int cc = 32456;
        System.out.println(Integer.toBinaryString(cc)); //decimal should be 32456, binary should be 1111 1101 1001 000
        System.out.println(Integer.toBinaryString(cc >> 2)); //decimal should be 8114, binary should be 1111 1101 1001 0

        // 5.
        int x1 = 7;
        int y = 17;
        int z = x1 & y;
        int zz = x1 | y;
        System.out.println(z); // x1=7 --> 110, y = 17 --> 10001, 00110 & 10001 --> 00001 --> 1, in decimal should be 1.
        System.out.println(zz); // x1=7 --> 110, y = 17 --> 10001, 00110 | 10001 --> 10111 --> 23, in decimal should be 23.

        // 6.
        int i = 2;
        System.out.println(i); //should be 2
        System.out.println(i++);// should be 2
        System.out.println(i); //should be 3

        // 7.
        int ii = 1;
        System.out.println(ii); // should be 1
        ii++;
        System.out.println(ii); // should be 2
        ++ii;
        System.out.println(ii); // should be 3
        ii+=1;
        System.out.println(ii); // should be 4

        //8.
        int x2 = 5;
        int y2 = 8;
        int z2 = (++x2 + y2);
        System.out.println(z2); // should be 14

        int x3 = 5;
        int y3 = 8;
        int z3 = (x3++ + y3);
        System.out.println(z3); // it is 13
    }
}
