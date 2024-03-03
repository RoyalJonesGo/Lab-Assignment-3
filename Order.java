public class Order {
    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;

    public Order(String item, int quantity, double unitPrice) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = 0.0;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        double discountRate = paymentMode.determineDiscountRate();
        totalAmount = calculateTotalAmount(discountRate);
    }

    private double calculateTotalAmount(double discountRate) {
        double discountedPrice = unitPrice - (unitPrice * discountRate);
        return quantity * discountedPrice;
    }

    public void displayPaymentDetails() {
        System.out.println("Order item is " + item);
        System.out.println("Unit price is " + unitPrice);
        System.out.println("Quantity is " + quantity);
        System.out.println();
        System.out.println("Payment order details:");
        System.out.println("Discount rate is " + totalAmount);
        System.out.println("Payment amount is " + totalAmount);
        System.out.println();
    }
}
