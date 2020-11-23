package lab2.ch1;

public class Fighters {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighters (String name, int health, int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public void attack(Fighters op) {
        op.health = op.health - this.damagePerAttack;
    }
    public String getName(){
        return name;
    }
    public int getHealth(){
        int health = this.health;
        return health;
    }
}
