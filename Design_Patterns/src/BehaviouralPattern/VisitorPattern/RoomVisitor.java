package BehaviouralPattern.VisitorPattern;

//Visitor interface would define visit method for each concrete element & accept them as parameter
public interface RoomVisitor {

    void visit(SingleRoom singleRoom);
    void visit(DoubleRoom doubleRoom);
}
