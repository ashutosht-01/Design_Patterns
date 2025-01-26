package StructuralPattern.AdapterPattern;
//Target Interface client will use it
public interface NotificationService {
    void SendEmail(String to,String title,String body);
}
