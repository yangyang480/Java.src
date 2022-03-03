package classlearning;

public class CharacterObjectClass {
    public static void main(String[] args) {

        Character letter = 'A'; //this character is a datatype
        Character asciNumber = 68; // this character is a class,the asciNumber is name, 68 is unicode.
        System.out.println(asciNumber); // output is D, because we are using unicode.

        //there are lots of methods inside of Character class. by type in objectname. to check all the methods.
        Character Obj1 = 'C';
        Character Obj2 = 'C';

        int result1 = Obj1.compareTo(Obj2);
        System.out.println(result1); //0

        boolean result2 = Obj1.equals(Obj2);
        System.out.println(result2); // true
        // whether the specified char value is a letter.
        System.out.println(Obj1.isLetter(Obj2)); //true
        // determin whether the specified char value is a digit.
        System.out.println(Obj1.isDigit(Obj2)); //false


    }
}
