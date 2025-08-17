import java.util.Scanner;

// Q1. Create a class StudentInfo with a method displayInfo() that prints your name, age, and grade.
// Expected Output:
// Name: Aman Sharma  
// Age: 16  
// Grade: 10th  

// solution
class Assignment{
        public String displayInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name = ");
        String name = sc.nextLine();

        System.out.print("Enter your Age = ");
        int age = sc.nextInt();

        System.out.print("Enter your grade = ");
        String grade = sc.next();

        sc.close();

        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }

    public static void main(String args[]) {
        Assignment a = new Assignment(); 
        System.out.println(a.displayInfo());
    }
}



// Q2. Create a class Calculator with a method addNumbers() that adds two numbers and prints the result
//solution
// class Assignment {
//     public int addNumbers(int num1,int num2){
//         return num1 +num2;
//     }
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter a first number = ");
//         int num1 = sc.nextInt();
        
//         System.out.print("Enter a second number = ");
//         int num2 = sc.nextInt();
        
//         Assignment a = new Assignment();
//         int sum = a.addNumbers(num1,num2);
//         System.out.println("Sum of Number = "+sum);

//         sc.close();
//     }
// }

// Q3. Create a class Greeting with a method sayHello() that takes your name as a parameter and prints:
//solution
// class Assignment {
//     public String sayHello(String name){
//         return "Hello,"+ name+"!"+" Welcome to Java programming";
//     }
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter your name = ");
//         String name = sc.next();
        
//         Assignment a = new Assignment();
//         String greeting = a.sayHello(name);
//         System.out.println(greeting);

//         sc.close();
//     }
// }

//Q4. Create a class Circle with a method calculateArea() that calculates and prints the area of a circle.
//solution
// class Assignment {
//     public float calculateArea(int radius){
//         return 3.14f*radius*radius;
//     }
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter radius = ");
//         int radius = sc.nextInt();

//         Assignment a = new Assignment();
//         float area = a.calculateArea(radius);
//         System.out.println("Sum of Number = "+area);

//         sc.close();
//     }
// }

//Q5. Create a class SimpleInterest with a method calculateInterest() that calculates simple interest.
//solution
// class Assignment {
//     public float calculateInterest(float principle,float rate,float time){
//         return (principle*rate*time)/100;
//     }
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in);
        
//         System.out.print("Enter principle = ");
//         float principle = sc.nextInt();

//         System.out.print("Enter rate = ");
//         float rate = sc.nextInt();

//         System.out.print("Enter time = ");
//         float time = sc.nextInt();

//         Assignment a = new Assignment();
//         float SI = a.calculateInterest(principle,rate,time);
//         System.out.println("Simple Intrest = "+SI);

//         sc.close();
//     }
// }

