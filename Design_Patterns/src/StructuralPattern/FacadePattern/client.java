package StructuralPattern.FacadePattern;

public class client {
    public static void main(String[] args) {
        //Client code interacting with API gateway (Facade)(hides complexity of internal structure)
        //centralized control
        //client got decoupled from internal structure of microservice
        ApiGateway apiGateway = new ApiGateway();
        apiGateway.getFullOrderDetails();
    }
}
