
package abstraction;


public class Main {
     public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new Paypal();

        p1.pay(100);  // Output: Paid 100 using Credit Card.
        p2.pay(50);   // Output: Paid 50 using PayPal.

        p1.paymentInfo(); // Output: This is a payment method.
    }
}
