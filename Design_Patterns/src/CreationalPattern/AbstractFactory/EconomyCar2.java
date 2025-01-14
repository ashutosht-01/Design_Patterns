package CreationalPattern.AbstractFactory;

public class EconomyCar2 implements Car{
    @Override
    public void getTopSpeed() {
        System.out.println("Top speed is : "+120);
    }
}
