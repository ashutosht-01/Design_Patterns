package BehaviouralPattern.StrategyPattern;

public class main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CerditCard());
        paymentService.pay();
    }
}
