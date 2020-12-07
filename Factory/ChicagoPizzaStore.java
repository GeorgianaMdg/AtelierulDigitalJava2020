package Factory;

public class ChicagoPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("CHMargerita")){
            return new CHMargerita();
        }
        if(type.equals("CHQuatro")){
            return new CHQuatro();
        }
        return pizza;
    }
}
