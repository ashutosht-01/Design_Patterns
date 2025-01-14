package CreationalPattern.AbstractFactory;

public class EconomyCar1 implements Car{
    @Override
    public void getTopSpeed() {
        System.out.println("Top speed is : "+100);
    }
}
