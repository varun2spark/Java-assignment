import java.util.Scanner;
// Experiment 1 – Multiplication Table Generator
// Problem Description:
// Write a Java program to print the multiplication table of a given number n up to 10.
class Lab4{
    public static void printTable(int num){
            for(int i=1;i<=10;i++){
                System.out.println(num+" x "+i+" = "+(num*i));
            }
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int num = sc.nextInt();

        printTable(num);
        sc.close();
    }
}

//Experiment 2 – Factorial of a Number
// Problem Description:
// Write a Java program to find the factorial of a given number using iteration.
// class Lab4{
//     public static long factorial(int n){
//         long fact = 1;
//         for(int i=n;i>=1;i--){
//             fact=fact*i;
//         }return fact;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number = ");
//         int n = sc.nextInt();

//         System.out.println("Factorial of "+n+" = "+factorial(n));

//         sc.close();
//     }
// }

// Experiment 3 – Reverse Digits of a Number
//Problem Description:
// Write a Java program to reverse the digits of a given number.
// class Lab4{
//     public static int reverseNumber(int n){
//         int rev = 0;
//         while(n!=0){
//             rev=(rev*10)+(n%10);
//             n=n/10;
//         }return rev;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number = ");
//         int n = sc.nextInt();

//         System.out.println("Reverse = "+reverseNumber(n));

//         sc.close();
//     }
// }

//Experiment 4 – Sum of Digits
//Problem Description:
// Write a Java program to find the sum of digits of a given number.
// class Lab4{
//     public static int sumOfDigits(int n){
//         int sum = 0;
//         while(n!=0){
//             sum=sum+(n%10);
//             n=n/10;
//         }return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number = ");
//         int n = sc.nextInt();

//         System.out.println("Reverse = "+sumOfDigits(n));

//         sc.close();
//     }
// }

// Experiment 5 – Prime Number Check
// Problem Description:
// Write a Java program to check if a number is prime.
// class Lab4{
//     public static boolean isPrime(int n){
//         int f=0;
//         for(int i=1;i<=n;i++){
//             if (n%i==0) {
//                 f++;
//             }
//         }if(f==2){
//             return true;
//         }else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter a number = ");
//         int n = sc.nextInt();

//         if (isPrime(n)) {
//             System.out.println("Prime");
//         }else{
//             System.out.println("Not Prime");
//         }
//         sc.close();
//     }
// }