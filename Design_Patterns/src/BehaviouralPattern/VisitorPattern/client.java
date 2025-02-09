package BehaviouralPattern.VisitorPattern;

//Use case: When you want to add a new operation to existing class without changing them
//Operation are separated out in different classes
public class client {
    public static void main(String[] args) {
        //client has a both visitor as well as element

        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();
        RoomPricingVisitor roomPricingVisitor = new RoomPricingVisitor();
        //Double dispatch - method which needs to invoked decided by caller obj & obj passed in argument
        singleRoom.accept(roomPricingVisitor);
        doubleRoom.accept(roomPricingVisitor);
        RoomMaintenanceVisitor roomMaintenanceVisitor = new RoomMaintenanceVisitor();
        singleRoom.accept(roomMaintenanceVisitor);
        doubleRoom.accept(roomMaintenanceVisitor);

    }
}
