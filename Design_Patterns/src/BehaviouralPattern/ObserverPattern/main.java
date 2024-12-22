package BehaviouralPattern.ObserverPattern;

public class main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        MobileDevice md = new MobileDevice("Iphone");
        DisplayDevice dd = new DisplayDevice("Samsung LCD");
        ws.attach(md);
        ws.attach(dd);
        ws.setTemperature(27);
        ws.setTemperature(28);
    }
}
