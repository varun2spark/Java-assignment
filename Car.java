//q1 Assignment: Create a Class with Method and Object in Java
// Problem Statement:
// Write a Java program to create a class named Car with the following:

// Instance variables:

// String brand

// String color

// int price

// Method:

// displayDetails() → This method should print the car's brand, color, and price.

// In the main() method:

// Create two objects of the Car class.

// Assign values to each object’s variables.

// Call the displayDetails() method for each object.

import java.util.Scanner;
public class Car {
    String brand;
    String color;
    int price;

    void displayDetails(){
        System.out.println("Car Brand = "+brand);
        System.out.println("Color = "+color);
        System.out.println("Price = "+price);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Car car = new Car();

        System.out.print("Enter car brand = ");
        car.brand=sc.nextLine();

        System.out.print("Enter its color = ");
        car.color=sc.nextLine();

        System.out.print("Enter its price = ");
        car.price=sc.nextInt();

        car.displayDetails();
        sc.close();
    }
}
