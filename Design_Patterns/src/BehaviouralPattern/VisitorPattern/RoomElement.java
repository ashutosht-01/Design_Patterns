package BehaviouralPattern.VisitorPattern;
//Element would accept visitor as parameter
public interface RoomElement {
    public void accept(RoomVisitor roomVisitor);
}
