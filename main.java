// . Write a Java program to perform the following tasks:
//  1. Create a class called "Dog":
// o Define two instance variables: name (String) and breed (String).
// o Implement a constructor that initializes the name and breed attributes.
// 2. Create two instances of the "Dog" class:
// o Use the constructor to set the initial values of the name and breed attributes for each          instance.
// 3. Implement set methods:
// o Create set methods for both name and breed attributes, allowing for modification of these    values after object creation.
// 4. Update and print the attributes:
// o Use the setter methods to update the name and breed attributes of each instance.
// o Print the updated values of the name and breed for both instances.
// Example:
// If the initial values for the first dog are "Buddy" (name) and "Golden Retriever" (breed), and the second dog is "Max"(name) and "Bulldog" (breed), you should be able to change their names to "Rocky" and "Charlie" and their breeds to "Labrador" and "Poodle" respectively using the set methods, then print the updated information

//Solution 
import java.util.Scanner;
class Dog{
    String name;
    String breed;

    Dog(String name,String breed){
        this.name=name;
        this.breed=breed;
    }

    void set(String name,String breed){
        this.name=name;
        this.breed=breed;
    }

    void display(){
        System.out.println("Name = "+name);
        System.out.println("Breed = "+breed);
    }
}

class main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        //for dog1
        System.out.print("Enter name of the first dog = ");
        String name1 = sc.next();

        System.out.print("enter its breed = ");
        String breed1 = sc.next();

        Dog dog1 = new Dog(name1,breed1);

        //for Dog2
        System.out.println("Enter name of the second dog = ");
        String name2 = sc.next();

        System.out.println("enter its breed = ");
        String breed2 = sc.next();

        Dog dog2 = new Dog(name2,breed2);

        //set

        dog1.set("Shyam","Human");
        dog2.set("Varun","Great Human");

        //display
        dog1.display();
        dog2.display();

        sc.close();
    }
}