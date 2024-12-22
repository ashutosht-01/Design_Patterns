package DIP;

public class MsgService implements NotificationChannel{
    @Override
    public void send() {
        System.out.println("Notification send by message");

    }
}
