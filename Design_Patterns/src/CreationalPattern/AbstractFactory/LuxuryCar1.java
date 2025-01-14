package CreationalPattern.AbstractFactory;

public class LuxuryCar1 implements Car{
    @Override
    public void getTopSpeed() {
        System.out.println("Top speed of this car is : "+200);
    }
}
