package BehaviouralPattern.StateDesignPattern;

public class client {
    //Use case: Object behaviour changes based on change of its internal state
    public static void main(String[] args) {
        DirectionService ds = new DirectionService();
        ds.setTransportMode(new Walking());
        System.out.println("Walking ETA.. "+ds.getETA());
        System.out.println("Direction for walking.."+ds.getDirection());
        ds.setTransportMode(new Train());

        System.out.println("Train direction.. "+ds.getDirection());
        System.out.println("Train ETA.."+ds.getETA());
    }
}
