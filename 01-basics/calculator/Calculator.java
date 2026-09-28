package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;
        double number1, number2;

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
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();

                    System.out.println("Result: " + (number1 + number2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();

                    System.out.println("Result: " + (number1 - number2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();

                    System.out.println("Result: " + (number1 * number2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    number1 = scanner.nextDouble();

                    System.out.print("Enter second number: ");
                    number2 = scanner.nextDouble();

                    if (number2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (number1 / number2));
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
}