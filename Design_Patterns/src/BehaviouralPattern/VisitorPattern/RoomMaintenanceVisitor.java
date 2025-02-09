package BehaviouralPattern.VisitorPattern;

public class RoomMaintenanceVisitor implements RoomVisitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Maintenance of single room");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Maintenance of double room");
    }
}
