/**
 * This program calculates the sum of two numbers with input validation
 * Demonstrates exception handling and user input validation
 */
import java.util.*;

public class Sum {
    /**
     * Main method - entry point of the program
     * Takes two numbers as input, validates them, and calculates their sum
     * param args command line arguments (not used in this program)
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Sum Calculator!");
        
        // Initialize variables for input numbers
        int a = 0, b = 0;
        boolean validInput = false;
        
        // Loop until valid input is received
        while (!validInput) {
            try {
                // Get first number with validation
                System.out.print("Please enter the first number: ");
                a = Integer.parseInt(sc.nextLine());
                
                // Get second number with validation
                System.out.print("Please enter the second number: ");
                b = Integer.parseInt(sc.nextLine());
                
                validInput = true;  // Exit loop if both inputs are valid
            } catch (NumberFormatException e) {
                // Handle invalid input (non-integer values)
                System.out.println("Invalid input. Please enter valid integers.");
            }
        }
        
        // Calculate and display the sum
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
        
        sc.close();  // Close scanner to prevent resource leak
    }
}