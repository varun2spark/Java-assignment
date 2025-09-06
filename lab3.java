
// Write a parameterized constructor to initialize these values and a method displayDetails() to print book
// details.

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

// class lab3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter Title = ");
//         String title = sc.nextLine();

//         System.out.print("Enter Author = ");
//         String author = sc.nextLine();

//         System.out.print("Enter Price = ");
//         double price = sc.nextDouble();

//         Book n = new Book(title, author, price);
//         n.displayDetails();

//         sc.close();
//     }
// }
//Create a Car class with attributes: brand and model. Implement both default and parameterized constructors.
// Default constructor should assign "Unknown" to brand and model.

// class Car{
//     String brand;
//     String model;
//     public Car(){
//         this.brand="Unknown";
//         this.model="Unknown";

//     }public Car(String brand, String model){
//         this.brand=brand;
//         this.model=model;

//     }public void display(){
//         System.out.println("Brand: "+brand);
//         System.out.println("Model: "+model);
//     }
// }class lab3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.err.print("Enter Brand = ");
//         String brand = sc.nextLine();

//         System.out.print("Enter Model = ");
//         String model = sc.nextLine();

//         Car c1 = new Car(brand,model);
//         c1.display();

//         Car c2 = new Car();
//         c2.display();

//         sc.close();
//     }
// }

//Create a MathOperation class with overloaded methods add() to handle:
// class MathOperation{
//     int a;
//     int b;
//     int c;
//     double d;
//     double e;

//     public int add(int a, int b){
//         this.a=a;
//         this.b=b;
//         return a+b;
//     }
//     public int add(int a, int b, int c){
//         this.a=a;
//         this.b=b;
//         this.c=c;
//         return a+b+c;
//     }
//     public double add(double d, double e){
//         this.d=d;
//         this.e=e;
//         return d+e;
//     }
// }class lab3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a int num1 = ");
//         int a = sc.nextInt();

//         System.out.print("Enter a int num2 = ");
//         int b = sc.nextInt();

//         System.out.print("Enter a int num3 = ");
//         int c = sc.nextInt();

//         System.out.print("Enter a double num1 = ");
//         double d = sc.nextDouble();

//         System.out.print("Enter a double num2 = ");
//         double e  = sc.nextDouble();

//         MathOperation m = new MathOperation();

//         System.out.println(m.add(a, b));
//         System.out.println(m.add(a, b, c));
//         System.out.println(m.add(d, e));
        
//         sc.close();

//     }
// }

//Create a Student class with private attributes: name and marks. Use getter and setter methods to access and
//update values.

// class Student{
//     private String name;
//     private int marks;

//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         this.name=name;
//     }
//     public int getMarks(){
//         return marks;
//     }
//     public void setMarks(int marks){
//         if((marks>=0)&&(marks<=100)){
//             this.marks=marks;
//         }else{
//             System.out.println("Marks should be between 0 and 100");
//         }
//     }
// }class lab3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         Student st = new Student();

//         System.out.print("Enter Name = ");
//         st.setName(sc.nextLine());

//         System.out.print("Enter marks = ");
//         st.setMarks(sc.nextInt());

//         System.out.println(st.getName());
//         System.out.println(st.getMarks());
//     }
// }

//Create an Employee class with private fields: id, name, and salary. Initialize them using a constructor and
// provide getter methods.
// class Employee{
//     private int id;
//     private String name;
//     private double salary;

//     public Employee(int id, String name, double salary){
//         if(id>0){
//             this.id=id;
//         }else{
//             System.out.println("ID must be greater than 0");
//         }
//         this.name=name;
//         if(salary>=0){
//             this.salary=salary;
//         }else{
//             System.out.println("Salary must be positive");
//         }
        
//     }
//     public int getId(){
//         return id;
//     }
//     public String getName(){
//         return name;
//     }
//     public double getSalary(){
//         return salary;
//     }
// }class lab3{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your Name = ");
//         String name = sc.nextLine();

//         System.out.print("Enter your ID = ");
//         int id = sc.nextInt();

//         System.out.print("Enter Salary = ");
//         double salary = sc.nextDouble();

//         Employee em = new Employee(id,name,salary);

//         System.out.println("ID: "+em.getId());
//         System.out.println("Name: "+em.getName());
//         System.out.println("Salary: "+em.getSalary());
//     }
// }