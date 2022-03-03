package monster_homework;

public class WaterMonster extends Monster{

    public WaterMonster(String name) {
        super(name);
    }

    protected void attack()
    {
        System.out.println("Attack with water!");
    }
}
