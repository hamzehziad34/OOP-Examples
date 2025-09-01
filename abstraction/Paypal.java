
package abstraction;


public class Paypal extends Payment  {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
    
}
