package StructuralPattern.AdapterPattern;
//Legacy system
public class EmailNotificationService implements NotificationService{
    @Override
    public void SendEmail(String to, String title, String body) {
       System.out.println("Sending email to:"+to+" having title: "+title+" and body: "+body);
    }
}
