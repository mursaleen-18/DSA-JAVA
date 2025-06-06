/**
 * This program calculates the product of two numbers
 * Demonstrates basic arithmetic operations and user input handling
 */
import java.util.Scanner;

public class Product {
    /**
     * Main method - entry point of the program
     * Takes two numbers as input and calculates their product
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Get first number from user
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        // Get second number from user
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        
        // Calculate product of the two numbers
        int product = a * b;
        
        // Display the result
        System.out.println("The product of the two numbers is: " + product);
        
        sc.close();  // Close scanner to prevent resource leak
    }
}
