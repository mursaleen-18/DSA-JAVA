/**
 * Program to print a message multiple times using a counter
 * Demonstrates the use of while loop with a counter variable
 */
import java.util.*;

public class count {
    /**
     * Main method - entry point of the program
     * Takes a number as input and prints a message that many times
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        // Read number from user input
        int n = sc.nextInt();
        
        // Initialize counter
        int count = 1;
        
        // Loop until counter reaches input number
        while (count <= n) {
            System.out.println(count + " Hellow world!!");
            count++;  // Increment counter
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }
}