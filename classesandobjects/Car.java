/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classesandobjects;

/**
 *
 * @author hamze
 */
public class Car {
      // Attributes (fields)
    String brand;
    int year;

    // Constructor
    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
    
}
