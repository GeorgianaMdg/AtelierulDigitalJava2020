package lab2.ch3;

public class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    public void walk(){
        System.out.println("walk");
    }
    public void eat(){
        System.out.println("eat");
    }
}
