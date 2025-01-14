package CreationalPattern.AbstractFactory;

public class client {
    public static void main(String[] args) {
        CarFactory economyCarFactory = CarFactoryProducer.getFactoryInstance("Economy");
        Car economy=economyCarFactory.getInstance(500000);
        economy.getTopSpeed();
        CarFactory luxuryCarFactory = CarFactoryProducer.getFactoryInstance("Luxury");
        Car premium = luxuryCarFactory.getInstance(700000);
        premium.getTopSpeed();
    }
}
