
package abstraction;

// Abstract class
public abstract class Payment {
     // Abstract method (no body)
    public abstract void pay(double amount);

    // Regular method
    public void paymentInfo() {
        System.out.println("This is a payment method.");
    }
    
}
