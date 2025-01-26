package StructuralPattern.DecoratorPattern;

import java.util.Scanner;

public class PizzaShop {
    public static void main(String[] args) {
        System.out.println("Please enter your choice for topping");
        Pizza basePizza = new BasePizza();
       // 1- cheese 2- Mushroom 3 - Olive - 4- CheeseOlive
        Scanner scn = new Scanner(System.in);
       int choice= scn.nextInt();
       switch (choice){
           case 1:
               Pizza cheesePizza = new CheeseDecorator(basePizza);
               System.out.println(cheesePizza.getDescription());
               System.out.println("Total price of pizza after toppings "+cheesePizza.getPrice());
           case 2:
               Pizza mushroomPizza = new CheeseDecorator(basePizza);
               System.out.println(mushroomPizza.getDescription());
               System.out.println("Total price of pizza after toppings "+mushroomPizza.getPrice());
           case 3:
               Pizza olivePizza = new CheeseDecorator(basePizza);
               System.out.println(olivePizza.getDescription());
               System.out.println("Total price of pizza after toppings "+olivePizza.getPrice());
           case 4:
               Pizza cheeseOlivePizza = new CheeseDecorator(new OliveDecorator(basePizza));
               System.out.println(cheeseOlivePizza.getDescription());
               System.out.println("Total price of pizza after toppings "+cheeseOlivePizza.getPrice());

       }

    }
}
