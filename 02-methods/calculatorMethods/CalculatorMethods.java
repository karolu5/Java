package calculatorMethods;

import java.util.Scanner;

public class CalculatorMethods {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int option;
        double a, b;

        do {
            System.out.println("\n=== Calculator ===");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();

            switch (option) {

                case 1:
                    a = readNumber(scanner, "Enter first number: ");
                    b = readNumber(scanner, "Enter second number: ");

                    System.out.println("Result: " + add(a, b));
                    break;

                case 2:
                    a = readNumber(scanner, "Enter first number: ");
                    b = readNumber(scanner, "Enter second number: ");

                    System.out.println("Result: " + subtract(a, b));
                    break;

                case 3:
                    a = readNumber(scanner, "Enter first number: ");
                    b = readNumber(scanner, "Enter second number: ");

                    System.out.println("Result: " + multiply(a, b));
                    break;

                case 4:
                    a = readNumber(scanner, "Enter first number: ");
                    b = readNumber(scanner, "Enter second number: ");

                    if (b == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + divide(a, b));
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option, try again.");
            }

        } while (option != 0);

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

    public static double readNumber(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

}