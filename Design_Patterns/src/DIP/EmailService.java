package DIP;
public class EmailService implements NotificationChannel{
    @Override
    public void send() {
        System.out.println("Notification send by email");
    }
}
