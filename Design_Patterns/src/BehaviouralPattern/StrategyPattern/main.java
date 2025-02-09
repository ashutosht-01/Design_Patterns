package BehaviouralPattern.StrategyPattern;
//when you want to separate out an algorithm that changes at runtime each would be same across element
public class main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.setPaymentStrategy(new CerditCard());
        paymentService.pay();
    }
}
