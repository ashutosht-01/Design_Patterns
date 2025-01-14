package CreationalPattern.AbstractFactory;

public class CarFactoryProducer {
    public static CarFactory getFactoryInstance(String type){
      switch (type){
          case "Economy":
              return new EconomyCarFactory();
          default:
              return new LuxuryCarFactory();
      }
    }
}
