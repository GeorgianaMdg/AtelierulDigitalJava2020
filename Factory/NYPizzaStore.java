package Factory;

public class NYPizzaStore extends PizzaStore{
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("Margerita")){
            return new NYMargerita();
        }
        if(type.equals("Quatro")){
            return new NYQuatro();
        }
        return pizza;
    }
}
