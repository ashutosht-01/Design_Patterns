package CreationalPattern.BuilderPattern;

public class House {
    //N - 2^N constructors
    private String roof;
    private String floor;
    //optional
    private boolean hasGarden;
    private boolean hasSwimmingPool;

    private House(){
    }
    public static House getInstance(HouseBuilder builder){
       House obj = new House();
       obj.floor=builder.floor;
       obj.roof = builder.roof;
       obj.hasGarden=builder.hasGarden;
       obj.hasSwimmingPool=builder.hasSwimmingPool;
       return obj;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", floor='" + floor + '\'' +
                ", hasGarden=" + hasGarden +
                ", hasSwimmingPool=" + hasSwimmingPool +
                '}';
    }
}
