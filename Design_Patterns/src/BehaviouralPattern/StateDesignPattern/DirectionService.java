package BehaviouralPattern.StateDesignPattern;

//context class
public class DirectionService {
    private TransportMode transportMode;

    public void setTransportMode(TransportMode transportMode) {
        this.transportMode = transportMode;
    }
  public int getETA(){
        return transportMode.getETA();
  }
  public String getDirection(){
        return transportMode.getDirection();
  }

}
