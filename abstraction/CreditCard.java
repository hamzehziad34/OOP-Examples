/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstraction;

/**
 *
 * @author hamze
 */
public class CreditCard extends Payment {
     @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
    
}
