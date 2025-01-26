package StructuralPattern.AdapterPattern;
//Adaptee- incompatible interface that needs to integrated with existing system
public class SendGrid {
    public void send(String recipient,String body,String title){
        System.out.println("sending email to recipient: "+recipient+" having body and title"+body+" "+title+"respectively");
    }
}
