package GenericDemo;

public class G_multiplevariable <myvalue, mykey>{ //they are just variable, can be anyname

    private mykey v1;
    private myvalue v2;

    public G_multiplevariable()
    {

    }

    public G_multiplevariable(myvalue v2, mykey v1)
    {
        this.v1 = v1;
        this.v2 = v2;
    }

    public mykey getV1() {
        return v1;
    }

    public void setV1(mykey v1) {
        this.v1 = v1;
    }

    public myvalue getV2() {
        return v2;
    }

    public void setV2(myvalue v2) {
        this.v2 = v2;
    }
// we can also create new method then we don't need to sout in the runnable class, we can just call the method to print.
    public void printBothVariable()
    {
        System.out.println("Value of v1: " + this.v1);
        System.out.println("Value of v2: " + this.v2);
    }
}
