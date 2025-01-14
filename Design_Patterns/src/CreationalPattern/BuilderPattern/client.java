package CreationalPattern.BuilderPattern;
//Use case : whenever your object has many optional members and constructors becomes two large
//Not to use:  when object has few simple parameters and performance concerns e additional overhead introduced by builder(new class).
public class client {
    public static void main(String[] args) {
     //Clear separation between the construction and representation of an object.
        House house = new HouseBuilder("Wood","Concrete")
                          .setHasGarden(true)
                          .setHasSwimmingPool(false)
                           .build();
       System.out.println(house.toString());
    }
}
