package generics;

public class Gen_ClassDemo<DataType>{ //<we need this.>
    // class level variable
    // private int    a;
    private DataType varOne;

    public Gen_ClassDemo(DataType var)
    {
        this.varOne = var;
    }

    public void setVarOne(DataType var)
    {
        this.varOne = var;
    }

    public DataType getVarOne()
    {
        return this.varOne;
    }


    public <Datatype> void printArray(DataType[] elements)
    {
        for(DataType items : elements)
        {
            System.out.println(items);
        }}
}
