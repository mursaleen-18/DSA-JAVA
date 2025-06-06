/**
 * Program to check if a number is even or odd
 * Demonstrates the use of if-else statements and modulo operator
 */
import java.util.Scanner;

public class evenOdd {
    /**
     * Main method - entry point of the program
     * Takes a number as input and determines if it's even or odd
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        
        // Read number from user input
        int num = sc.nextInt();
        
        // Check if number is even using modulo operator
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        }
        else {
            System.out.println(num + " is an odd number.");
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
