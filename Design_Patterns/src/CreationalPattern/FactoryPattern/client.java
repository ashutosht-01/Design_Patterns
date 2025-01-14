package CreationalPattern.FactoryPattern;

public class client {
    public static void main(String[] args) {

        //Help us in centralizing the creation logic & delegates responsibility of object creation to factory
        //Helpful in systems where you need to create multiple type of objects
        Transport bus = TransportFactory.createVehicle("Bus");
        Transport bike = TransportFactory.createVehicle("Bike");
        bus.travel();
        bike.travel();
    }
}
