package BehaviouralPattern.ObserverPattern;

public interface Subject {
void attach(Observer item);
void remove(Observer item);
void  notifyObservers();
}
