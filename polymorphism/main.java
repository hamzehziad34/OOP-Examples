/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism;

/**
 *
 * @author hamze
 */
public class main {
    
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bicycle();

        v1.move();  // Output: Car is driving
        v2.move();  // Output: Bicycle is pedaling
    }
}
    
    

