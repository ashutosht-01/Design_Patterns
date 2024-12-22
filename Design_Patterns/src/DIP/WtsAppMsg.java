package DIP;

public class WtsAppMsg implements NotificationChannel
{
    @Override
    public void send() {
        System.out.println("Notification send by whatsapp");
    }
}
