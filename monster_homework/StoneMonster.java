package monster_homework;

public class StoneMonster extends Monster{

    public StoneMonster(String name) {
        super(name);
    }

    protected void attack()
    {
        System.out.println("Attack with stones!");
    }
}
