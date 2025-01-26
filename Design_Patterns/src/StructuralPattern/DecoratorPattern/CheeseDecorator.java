package StructuralPattern.DecoratorPattern;
//Concrete Decorator
public class CheeseDecorator extends OliveDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription()+" Cheese topping";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice()+5;
    }
}
