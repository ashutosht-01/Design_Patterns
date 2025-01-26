package StructuralPattern.DecoratorPattern;

public class OliveDecorator extends PizzaDecorator{
    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+" Olive topping";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+5;
    }
}
