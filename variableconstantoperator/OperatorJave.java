package variableconstantoperator;

public class OperatorJave {
    public static void main(String[] args) {

        boolean c = (1 < 2);
        System.out.println(c);

        int score = 10;
        int temp = 200;
        boolean result = (score >= 10) && (temp >= 300); //true && false = false
        System.out.println(result);

        int score2 = 10;
        int temp2 = 200;
        boolean result2 = (score2 >= 10) || (temp2 >= 300); //true || false = true
        System.out.println(result2);

        //int z = 10;
        //System.out.println(~z); // -12

        //int d = 89;
        //System.out.println(~d);

       // ------ xor------  if give you
        int age = 24;
        int weight = 140;
        boolean rs3 = (age > 34) ^ (weight > 140); // false fasle = false
        System.out.println(rs3);

        int age1 = 24;
        int weight1 = 140;
        boolean rs4 = (age1 > 14) ^ (weight1 > 140); // ture fasle = true
        System.out.println(rs4);

        int a = 4;
        a += 4;
        System.out.println(+a);

        int aa = 10;
        System.out.println(++aa); //11
        System.out.println(aa++);//12
        System.out.println(--aa); //11

        int bb = 10;
        System.out.println(bb++); //10 it will print the bb value first and then ++.

        int aaa = 10;
        System.out.println(aaa++ + ++aaa); //22

        int aaaa = 10;
        aaa = aaaa + 1;
        System.out.println(aaaa);
        System.out.println(aaaa);
        System.out.println(aaaa++ + ++aaaa); //22



    }
}
