package StructuralPattern.DecoratorPattern;

public class BasePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Basic Pizza";
    }

    @Override
    public int getPrice() {
        return 10;
    }
}
