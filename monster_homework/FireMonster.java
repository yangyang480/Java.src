package monster_homework;

public class FireMonster extends Monster{

    // constructor
    public FireMonster(String name){
        super(name);
    }
    @Override
    protected void attack()
    {
        System.out.println("Attack with fire!");
    }
}
