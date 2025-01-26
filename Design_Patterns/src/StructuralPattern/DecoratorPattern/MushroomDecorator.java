package StructuralPattern.DecoratorPattern;
//Concrete Decorator
public class MushroomDecorator extends PizzaDecorator{
    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+" Mushroom topping";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+5;
    }
}
