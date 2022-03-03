package generics;

public class G_methodDemo {
    //-------------------------demostration-----------
    private int a;
    public G_methodDemo( int a ) {
        this.a = a;
    }

    public G_methodDemo()
    {}


    public int mymethod(int a)
    {
        int b = a;
        return b;
    }

    public  double mymethod(double a)
    {
        double  b = a;
        return b;
    }

    //------- GEneric MEthod()-----------

    public <DataTypes> void genericmethod(DataTypes a)
    {
        System.out.println(a);
    }
        // if you put datatypes here we can pass any type of data.
        //if we put int, we can only pass int type of data.



}
