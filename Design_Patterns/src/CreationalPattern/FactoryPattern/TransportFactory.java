package CreationalPattern.FactoryPattern;

public class TransportFactory {
    public static Transport createVehicle(String type){
        switch (type){
            case "Bus":
                return new bus();
            case "Train":
                return new Train();
            case "Bike":
                return new bike();
            default:
                throw new IllegalArgumentException("Invalid transport type..");
        }

    }
}
