package BehaviouralPattern.VisitorPattern;

//Concrete visitor defines different operation that you want to apply
public class RoomPricingVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        singleRoom.roomPrice=10;
        System.out.println("Single room price "+singleRoom.roomPrice);
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
     doubleRoom.roomPrice=20;
     System.out.println("Double room price "+doubleRoom.roomPrice);
    }
}
