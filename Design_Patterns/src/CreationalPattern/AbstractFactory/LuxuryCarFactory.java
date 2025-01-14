package CreationalPattern.AbstractFactory;

public class LuxuryCarFactory implements CarFactory{
    @Override
    public Car getInstance(int price) {
        switch (price){
            case 700000:
                return new LuxuryCar2();
            default:
                return new LuxuryCar1();
        }
    }
}
