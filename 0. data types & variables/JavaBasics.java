/**
 * This program demonstrates basic Java input operations
 * Shows how to read different types of input using Scanner class
 */
import java.util.*;

public class JavaBasics {
    /**
     * Main method - entry point of the program
     * Demonstrates reading different types of input (String, int, float)
     * param args command line arguments (not used in this program)
     */
    public static void main(String args[]) {
        // Example of commented out print statements
        // System.out.println("hellow world!! It's me");
        // System.out.println("hellow world!! It's me");
        // System.out.println("hellow world!! It's me");

        // Example of commented out star pattern
        // System.out.println("*****");
        // System.out.println("*****");
        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        // Create Scanner object for reading input
        Scanner sc = new Scanner(System.in);
        
        // Read and display a string input
        String input = sc.nextLine();
        System.out.println("the input is " + input);
        
        // Read and display an integer input
        int num = sc.nextInt();
        System.out.println("the number is " + num);
        
        // Read and display a float input
        float Price = sc.nextFloat();
        System.out.println("the price is " + Price);
        
        sc.close();  // Close scanner to prevent resource leak
    }
} 


