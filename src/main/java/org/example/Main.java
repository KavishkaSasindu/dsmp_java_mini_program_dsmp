package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Calculate Circle Area");
            System.out.println("2. Check Even or Odd");
            System.out.println("3. Reverse a String");
            System.out.println("4. Calculate Factorial");
            System.out.println("5. Generate Fibonacci Series");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    calculateCircleArea(scanner);
                    break;
                case 2:
                    checkEvenOrOdd(scanner);
                    break;
                case 3:
                    reverseString(scanner);
                    break;
                case 4:
                    calculateFactorial(scanner);
                    break;
                case 5:
                    generateFibonacciSeries(scanner);
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void calculateCircleArea(Scanner scanner) {
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    private static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    private static void reverseString(Scanner scanner) {
        System.out.print("Enter a string: ");
        scanner.nextLine(); // Consume newline
        String input = scanner.nextLine();
        StringBuilder reversed = new StringBuilder(input).reverse();
        System.out.println("Reversed string: " + reversed);
    }

    private static void calculateFactorial(Scanner scanner) {
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        long factorial = 1;
        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + ": " + factorial);
    }

    private static void generateFibonacciSeries(Scanner scanner) {
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series: " + num1 + ", " + num2);
        for (int i = 2; i < terms; i++) {
            int next = num1 + num2;
            System.out.print(", " + next);
            num1 = num2;
            num2 = next;
        }
        System.out.println();
    }
}
