public class PaymentApp {
    public static void main(String[] args) {
        Order order = new Order("keyboard", 10, 300.0);

        order.setPaymentMode(new Gcash());
        order.displayPaymentDetails();

        order.setPaymentMode(new Maya());
        order.displayPaymentDetails();

        order.setPaymentMode(new ShopeePay());
        order.displayPaymentDetails();
    }
}
