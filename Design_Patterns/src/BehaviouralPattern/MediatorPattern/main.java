package BehaviouralPattern.MediatorPattern;

public class main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User p1= new User("John",chatRoom);
        User p2= new User("Roman",chatRoom);
        User p3 = new User("Xu..",chatRoom);
        chatRoom.addUser(p1);
        chatRoom.addUser(p2);
        chatRoom.addUser(p3);
        p1.sendMessage("Hi Everyone...");
    }
}
