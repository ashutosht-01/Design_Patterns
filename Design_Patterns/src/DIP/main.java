package DIP;

public class main {
    //Decoupling between high level & low level module
    public static void main(String[] args) {
        NotificationService emailService = new NotificationService(new EmailService());
        emailService.sendNotification();
    }
}
