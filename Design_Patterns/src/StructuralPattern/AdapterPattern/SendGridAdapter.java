package StructuralPattern.AdapterPattern;
//Add adapter classes that implements targets which uses instance of adaptee
public class SendGridAdapter implements NotificationService{
    public SendGrid sendGrid;
    public  SendGridAdapter(SendGrid sendGrid){
        this.sendGrid = sendGrid;
    }
    @Override
    public void SendEmail(String to, String title, String body) {
       sendGrid.send(to,body,title);
    }
}
