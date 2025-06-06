/**
 * Program to calculate sum of first n natural numbers
 * Demonstrates the use of while loop for summation
 */
import java.util.*;

public class sum {
    /**
     * Main method - entry point of the program
     * Takes a number as input and calculates sum of numbers from 1 to n
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        
        // Read number from user input
        int n = sc.nextInt();
        
        // Initialize sum and counter
        int sum = 0;
        int i = 1;
        
        // Calculate sum of numbers from 1 to n
        while (i <= n) {
            sum = sum + i;  // Add current number to sum
            i++;           // Increment counter
        }   
        
        // Display the result
        System.out.println("The sum of first " + n + " numbers is " + sum);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
