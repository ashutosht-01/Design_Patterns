package BehaviouralPattern.StrategyPattern;

//concrete strategy class
public class DebitCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("payment via debit card");
    }
}
