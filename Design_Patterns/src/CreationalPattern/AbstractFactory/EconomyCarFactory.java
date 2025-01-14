package CreationalPattern.AbstractFactory;
//Concrete Factory responsible for creating product
public class EconomyCarFactory implements CarFactory{

    @Override
    public Car getInstance(int price) {
        switch (price){
            case 600000:
                return new EconomyCar2();

            default:
                return new EconomyCar1();
        }

    }

}
