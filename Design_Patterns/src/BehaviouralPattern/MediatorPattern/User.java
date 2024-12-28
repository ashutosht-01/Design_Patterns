package BehaviouralPattern.MediatorPattern;

public class User {
    private String name;
    private ChatRoom chatRoom;
    User(String name,ChatRoom chatRoom){
        this.name=name;
        this.chatRoom=chatRoom;
    }
    public void sendMessage(String msg){
        System.out.println(this.name+" is sending msg to everyone"+" msg: "+msg);
        chatRoom.sendMessage(msg,this);
    }
    public void receiveMessage(String msg,User sender){
        System.out.println(this.name+" Received msg from "+sender.name+" msg: "+msg);
    }
}
