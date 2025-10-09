
import java.util.Scanner;

/*
The following are a set of simple exercises that will cement the basics of Loop structures. 
Feel free to do all of these in 1 file for ease of coding/testing. 
Make sure to comment each exercise as this file will serve as a good study guide later.

Print all numbers 1-100
Print all numbers 100-0
Print all numbers between -10 and +10
Take in 2 numbers from a user and print all numbers between these 2
Take in 3 numbers from a user and use them to set all 3 parts of the loop and print (Eg 1,10,2 would print from 1-10 in increments of 2)

Optional Exercises (Advanced)

Calculate the sum of all numbers 1-10 (1+2+3 etc)
Calculate the sum of all even numbers 1-100 and all odd numbers 1-100 (1+3+5 etc and 2+4+6 etc)
Write a loop that takes in 5 numbers from a user and outputs the sum of all inputted numbers
Write a loop that takes in 2 numbers from a user and raises the first number to the power of the second

 */


public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Print all numbers 1–100
        System.out.println("Numbers 1–100:");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. Print all numbers 100–0
        System.out.println("Numbers 100–0:");
        for (int i = 100; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 3. Print all numbers between -10 and +10
        System.out.println("Numbers -10 to +10:");
        for (int i = -10; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 4. Take in 2 numbers from user and print all numbers between them
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Numbers between " + num1 + " and " + num2 + ":");
        if (num1 <= num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = num1; i >= num2; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n");

        // 5. Take in 3 numbers (start, end, increment)
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter end number: ");
        int end = scanner.nextInt();
        System.out.print("Enter step size: ");
        int step = scanner.nextInt();

        System.out.println("Numbers from " + start + " to " + end + " by " + step + ":");
        for (int i = start; i <= end; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}