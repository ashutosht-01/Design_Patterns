package BehaviouralPattern.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator{
    List<User> users;
    public ChatRoom(){
        users=new ArrayList<>();
    }
    @Override
    public void sendMessage(String msg, User currUser) {
        for(User user:users)
            if(user!=currUser){
               user.receiveMessage(msg,currUser);
            }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
