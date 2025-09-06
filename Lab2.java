
import java.util.Scanner;

// Create a class Book with attributes: title, author, and price. Use a parameterized constructor to initialize
// the attributes and display the details of the book.
class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        if (title != null && !title.isBlank()) {
            System.out.print("Title: " + title);
        } else {
            System.out.print("Title: No null values for title");
        }

        if (author != null && !author.isBlank()) {
            System.out.print(", Author: " + author);
        } else {
            System.out.print(", Author: No null values for author");
        }

        if (price > 0) {
            System.out.print(", Price: " + price);
        } else {
            System.out.print(", Price must be greater than 0");
        }
        System.out.println();
    }
}

class lab2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Title = ");
        String title = sc.nextLine();

        System.out.print("Enter Author = ");
        String author = sc.nextLine();

        System.out.print("Enter Price = ");
        double price = sc.nextDouble();

        Book n = new Book(title, author, price);
        n.displayDetails();

        sc.close();
    }
}

//Create a class Rectangle with overloaded constructors: one taking no parameters, one taking length and
// breadth. Display area for both.

// class Rectangle{
//     double length;
//     double breadth;

//     public Rectangle(){
//         this.length=1.0;
//         this.breadth=1.0;
//         System.out.print("default ");
//     }

//     public Rectangle(double length, double breadth){
//         if(length > 0 && breadth > 0) {
//             this.length = length;
//             this.breadth = breadth;
//             System.out.print("Parameterized ");
//         } else {
//             System.out.println("length and breadth should be greater than 0");
//         }
//     }
    
//     public void calculateArea(){
//         System.out.println("Area: "+(length*breadth));
//     }
// }class lab2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length: ");
//         double length = sc.nextDouble();

//         System.out.print("Enter breadth: ");
//         double breadth = sc.nextDouble();

//         Rectangle r1 = new Rectangle();
//         r1.calculateArea(); 

//         Rectangle r2 = new Rectangle(length,breadth);
//         r2.calculateArea();

//         sc.close();
//     }
// }

//Create a class Student with attributes: name and marks. Use this to resolve ambiguity between instance
// variables and parameters.
// class Student{
//     String name;
//     double marks;
//     public Student(String name, double marks){
//         this.name=name;
//         if (marks>=0 &&marks<=100){
//             this.marks=marks;
//         }else{
//             System.out.println("Marks should be in between 0 and 100");
//         }
//     }public void displayInfo(){
//         System.out.println("Name: "+name+ ", Marks: "+marks);
//     }
// }
// class Lab2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Name = ");
//         String Name = sc.nextLine();

//         System.out.print("Enter Marks = ");
//         double marks = sc.nextDouble();

//         Student st = new Student(Name, marks);

//         st.displayInfo();
//         sc.close();
//     }
// }


//Create a MathOperations class with two overloaded methods add():
// class MathOperations{
//     public int add(int a, int b){
//         return (a+b);
//     }
//     public double add(double a, double b){ 
//         return (a+b);
//     }
// }class lab2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first number = ");
//         int a = sc.nextInt();
//         double Da = a;

//         System.out.print("Emter second number = ");
//         int b = sc.nextInt();
//         double Db = b;

//         MathOperations M = new MathOperations();

//         System.out.println("Sum of an integers = "+M.add(a, b));

//         System.out.println("Sum of an Doubles = "+ M.add(Da, Db));

//         sc.close();
//     }
// }

//Create a BankAccount class with private attributes: accountNumber and balance. Provide getters and
// setters with validation (balance cannot be negative).
// class BankAccount{
//     private String Account_number;
//     private double Balance;

//     public String getAccount_number(){
//         return Account_number;
//     }
//     public void setAccount_number(String Account_number){
//         this.Account_number=Account_number;
//     }

//     public void setBalance(double Balance){
//         if(Balance>=0){
//             this.Balance=Balance;
//         }else{
//             System.out.println("Balance should not be zero");
//         }
//     }
//     public void displayAccount(){
//         System.out.println("Account: "+Account_number+", Balance: "+Balance);
//     }  
// }
// class lab2{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         BankAccount ba = new BankAccount();

//         System.out.print("Enter Account number = ");
//         ba.setAccount_number(sc.nextLine());

//         System.out.print("Enter Balance = ");
//         ba.setBalance(sc.nextDouble());
        
//         ba.displayAccount();
//         sc.close();
//     }
// }