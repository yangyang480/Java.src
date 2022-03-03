package monster_homework;

public class Monster {

    private String name;
    public Monster(String name){
        this.name = name;
    }

    //create a method attack
    protected void attack() {
        System.out.println("I don't know how to attack!");
    }


}
