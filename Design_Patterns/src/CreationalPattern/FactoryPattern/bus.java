package CreationalPattern.FactoryPattern;

public class bus implements Transport{
    @Override
    public void travel() {
        System.out.println("Travel by bus");
    }
}
