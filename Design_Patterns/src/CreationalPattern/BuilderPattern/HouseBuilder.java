package CreationalPattern.BuilderPattern;

public class HouseBuilder {
    public String roof;
    public String floor;
    //optional
    public boolean hasGarden;
    public boolean hasSwimmingPool;
    public HouseBuilder(String roof,String floor){
        this.roof=roof;
        this.floor=floor;
    }
    public HouseBuilder setHasGarden(boolean hasGarden){
        this.hasGarden=hasGarden;
        return this;
    }
    public HouseBuilder setHasSwimmingPool(boolean hasSwimmingPool){
        this.hasSwimmingPool=hasSwimmingPool;
        return this;
    }
    public House build(){
        return House.getInstance(this);
    }
}
