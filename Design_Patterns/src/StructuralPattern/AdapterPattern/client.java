package StructuralPattern.AdapterPattern;

public class client {
    public static void main(String[] args) {
        NotificationService emailNotificationService = new EmailNotificationService();
        emailNotificationService.SendEmail("Ramesh"," Greetings","Welcome to the team..");

        NotificationService emailServiceWithSendGrid = new SendGridAdapter(new SendGrid());
        emailServiceWithSendGrid.SendEmail("Suresh","Greetings","Welcome to the team..");
    }
}
