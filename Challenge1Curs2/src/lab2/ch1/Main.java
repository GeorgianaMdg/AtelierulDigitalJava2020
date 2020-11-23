package lab2.ch1;

public class Main {
    public static void main(String[] args) {
        Fighters f1= new Fighters(name: "Fighter 1",health:100, damagePerAttack:20);
        Fighters f2= new Fighters(name: "Fighter 1",health:100, damagePerAttack:30);
        BoxingMatch bm= new BoxingMatch(f1,f2);

        System.out.println("winner="+bm.fight());

    }
}
