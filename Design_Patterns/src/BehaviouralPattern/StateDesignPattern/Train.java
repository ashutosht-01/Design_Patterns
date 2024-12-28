package BehaviouralPattern.StateDesignPattern;

public class Train implements TransportMode{
    @Override
    public int getETA() {
        return 1;
    }

    @Override
    public String getDirection() {
        return "Head north west for taking train..";
    }
}
