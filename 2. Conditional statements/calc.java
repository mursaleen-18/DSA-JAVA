/**
 * Simple calculator program that performs basic arithmetic operations
 * Demonstrates the use of switch statements for conditional operations
 */
import java.util.*; // Import the Scanner class for user input

public class calc {
    /**
     * Main method - entry point of the program
     * Takes two numbers and an operation as input and performs the calculation
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        // Prompt the user to enter two numbers
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt(); // Read the first number
        int b = sc.nextInt(); // Read the second number

        // Prompt the user to enter the operation (+, -, *, /)
        System.out.println("Enter the operation: ");
        char op = sc.next().charAt(0); // Read the operation character

        int result = 0; // Variable to store the result

        // Perform the operation based on user input
        switch(op) {
            case '+':
                result = a + b; // Addition
                break;
            case '-':
                result = a - b; // Subtraction
                break;
            case '*':
                result = a * b; // Multiplication
                break;
            case '/':
                result = a / b; // Division (integer division)
                break;
            default:
                System.out.println("Invalid operation."); // Handle invalid operator
        }

        // Display the result
        System.out.println("The result is: " + result);

        sc.close(); // Close the Scanner to free resources
    }
}
