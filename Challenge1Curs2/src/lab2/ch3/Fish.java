package lab2.ch3;

public class Fish extends Animal implements Pet{
    private String Name;

    public Fish(){
        super(legs:0);
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("walk like fish");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("eat like fish");
    }
}
