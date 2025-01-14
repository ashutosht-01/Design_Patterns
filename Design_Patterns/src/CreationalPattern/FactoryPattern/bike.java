package CreationalPattern.FactoryPattern;

public class bike implements Transport{
    @Override
    public void travel() {
        System.out.println("Travel by bike..");
    }
}
