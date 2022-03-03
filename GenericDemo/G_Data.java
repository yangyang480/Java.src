package GenericDemo;

public class G_Data <Datatype>{ //we will put anything here to let compiler think this is a generic class

    private  Datatype varName; //variable private to access this we need to getter setter

    //contructor
    public G_Data(Datatype v)
    {
        this.varName = v;
    }

    public G_Data()
    {

    }

    public  void setVarName(Datatype v)
    {
        this.varName = v;
    }
    public Datatype getVarName()
    {
        return  this.varName;
    }

    //we need to be called from runnable class
}
