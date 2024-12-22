package BehaviouralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;
//ObserveInterface allows us loose coupling (Open/Close principle)
//WeatherStation is publisher/Data Source
public class WeatherStation implements  Subject{
    float temperature;

    List<Observer> observerList;
    public WeatherStation(){
        this.observerList = new ArrayList<>();
    }
    //Attach/register
    @Override
    public void attach(Observer item) {
       observerList.add(item);
    }

    @Override
    public void remove(Observer item) {
    observerList.remove(item);
    }

    @Override
    public void notifyObservers() {
     for(Observer item: observerList){
         item.update(this.temperature);
     }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }
}
