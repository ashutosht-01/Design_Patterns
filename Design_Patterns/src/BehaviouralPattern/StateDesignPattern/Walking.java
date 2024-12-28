package BehaviouralPattern.StateDesignPattern;

public class Walking implements TransportMode{
    @Override
    public int getETA() {
        return 5;
    }

    @Override
    public String getDirection() {
       return "Walking towards north..";
    }
}
