package DIP;

//High level service should NOT depend on low level service instead it should depend on abstraction
public class NotificationService {
    NotificationChannel notificationChannel;
   public  NotificationService(NotificationChannel nc){
        notificationChannel=nc;
    }
    public void sendNotification(){
       notificationChannel.send();
    }
}
