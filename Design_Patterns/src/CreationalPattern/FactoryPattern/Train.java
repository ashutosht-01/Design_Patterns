package CreationalPattern.FactoryPattern;

public class Train implements Transport{
    @Override
    public void travel() {
        System.out.println("Travelling by train..");
    }
}
