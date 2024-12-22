package BehaviouralPattern.ObserverPattern;

public class MobileDevice implements Observer{
    public String name;
    public MobileDevice(String name){
      this.name = name;
    }
    @Override
    public void update(float temp) {
        System.out.println("temperature on "+name+" is "+temp);
    }
}
