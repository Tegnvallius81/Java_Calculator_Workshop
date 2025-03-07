import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepcounting = true;

        while (keepcounting) {
            System.out.print("Enter your first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Select a calculation method (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter your second number: ");
            double num2 = scanner.nextDouble();

            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, * or /.");
                    continue; // Hoppar över resten av loopen och börjar om
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue with a new calculation? (yes/no): ");
            String response = scanner.next();
            if (!response.equalsIgnoreCase("yes")) {
                keepcounting = false;
            }
        }

        System.out.println("Calculator is turned off.");
        scanner.close();
    }
}
