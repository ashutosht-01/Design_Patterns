package StructuralPattern.FacadePattern;

public class ApiGateway {
    private OrderService orderService;
    private PaymentService paymentService;
    private UserService userService;
    ApiGateway(){
        orderService = new OrderService();
        paymentService = new PaymentService();
        userService = new UserService();
    }
    public void getFullOrderDetails(){
        userService.getUserDetails();
        orderService.getOrderDetails();
        paymentService.getPaymentDetails();

    }
}
