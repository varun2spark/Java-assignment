//Q1 Create a class named Student.

// Add the following variables in the class:

// String name

// int rollNumber

// double marks

// Create a method named displayStudentDetails() which displays the values of all the variables.

// In the main() method (inside another class or the same), create an object of the Student class.

// Assign values to the variables and call the displayStudentDetails() method.

//solution
import java.util.Scanner;
class Student{
    String name;
    int roll_number;
    double marks;

    void displayStudentDetails(){
        System.out.println("Name = "+ name);
        System.out.println("Roll Number = "+ roll_number);
        System.out.println("marks = "+marks);
    }

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        
        System.out.print("Enter your Name = ");
        stu.name=sc.next();
        
        System.out.print("Enter Roll number = ");
        stu.roll_number=sc.nextInt();

        System.out.print("Enter marks = ");
        stu.marks=sc.nextInt();

        stu.displayStudentDetails();
        sc.close();
    }
}