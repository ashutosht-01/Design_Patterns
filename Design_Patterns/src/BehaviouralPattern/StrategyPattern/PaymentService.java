package BehaviouralPattern.StrategyPattern;

//context class - delegates task of payment to strategy at runtime
public class PaymentService {
  private  PaymentStrategy paymentStrategy;
  public void setPaymentStrategy(PaymentStrategy paymentStrategy){
  this.paymentStrategy = paymentStrategy;
  }
  public void pay(){
      paymentStrategy.processPayment();
  }
}
