import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int number = getNonNegativeInteger(scanner); // Get first input
        long factorial = calculateFactorial(number); // Calculate factorial
        System.out.println("The factorial of " + number + " is: " + factorial); // Display result
        
        number = getNonNegativeInteger(scanner); // Get second input immediately
        factorial = calculateFactorial(number); // Calculate factorial
        System.out.println("The factorial of " + number + " is: " + factorial); // Display result
        
        scanner.close();
    }

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger(Scanner scanner) {
        int number;
        
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) { // Check if input is an integer
                number = scanner.nextInt();
                if (number >= 0) {
                    return number; // Valid input, return value
                } else {
                    System.out.println("Invalid input. Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter a non-negative integer.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    // Method to calculate factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}