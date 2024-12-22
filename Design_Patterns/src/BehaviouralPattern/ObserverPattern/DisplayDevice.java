package BehaviouralPattern.ObserverPattern;

//Display device is Subscriber
public class DisplayDevice implements Observer{
    String name;
    public DisplayDevice(String name){
        this.name = name;
    }
    @Override
    public void update(float temp) {
       System.out.println("Temperature on "+name+" is "+temp);
    }
}
