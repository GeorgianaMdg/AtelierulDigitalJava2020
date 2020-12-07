package Factory;

public class Pizza {
    private String name;
    private String dough;

    @Override
    public String toString() {
        return super.toString();
    }

    public Pizza(String name, String dough) {
        this.name = name;
        this.dough = dough;
    }

    public void bake(){
        System.out.println("bake the pizza");
    }
    public void slice(){
        System.out.println("Slice the pizza");

    }
    public void box(){
        System.out.println("Put the pizza in the box");
    }
}
