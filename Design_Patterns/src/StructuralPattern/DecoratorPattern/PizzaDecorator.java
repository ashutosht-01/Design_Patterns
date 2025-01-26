package StructuralPattern.DecoratorPattern;
//Abstract Decorator
public abstract class PizzaDecorator implements Pizza{
    protected  Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza=pizza;
    }
    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public int getPrice() {
        return pizza.getPrice();
    }
}
