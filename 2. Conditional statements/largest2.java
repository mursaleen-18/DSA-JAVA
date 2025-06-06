/**
 * Program to find the largest of two numbers
 * Demonstrates the use of ternary operator for comparison
 */
import java.util.Scanner;

public class largest2 {
    /**
     * Main method - entry point of the program
     * Takes two numbers as input and finds the larger one
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        
        // Read two numbers from user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Use ternary operator to find the larger number
        int max = (a > b) ? a : b;
        
        // Display the result
        System.out.println(max + " is the largest number.");
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
 