package BehaviouralPattern.StrategyPattern;

public class CerditCard implements PaymentStrategy{

    @Override
    public void processPayment() {
        System.out.println("Payment via credit card");

    }
}
