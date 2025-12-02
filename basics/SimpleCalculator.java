import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        double result = 0;

        switch (choice) {
            case 1 -> result = a + b;
            case 2 -> result = a - b;
            case 3 -> result = a * b;
            case 4 -> result = b != 0 ? a / b : Double.NaN;
            default -> System.out.println("Invalid choice");
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}
