public class App {
    public static void main(String[] args) throws Exception {
        OrderService orderServiceClient = new OrderService();
        orderServiceClient.sendNotification();

        DeliveryService deliveryServiceClient = new DeliveryService();
        deliveryServiceClient.sendNotification();
    }
}
