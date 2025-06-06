/**
 * Program demonstrating function to add two numbers
 * Shows how to create and use a function with two parameters
 */
import java.util.*;

public class Add {
    /**
     * Calculates sum of two numbers
     * param a first number
     * param b second number
     * return sum of a and b as integer
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates addition using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Calculate and print sum of 5 and 7
        System.out.println(add(5, 7));
    }

    /**
     * Function to calculate and print the sum of two numbers
     * Takes user input for two integers and displays their sum
     */
    public static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();  // Read first number
        int b = sc.nextInt();  // Read second number
        int sum = a + b;       // Calculate sum
        sc.close();            // Close scanner to prevent resource leak
        System.out.println("sum is :" + sum);
    }

    /**
     * Simple function to print "Hello World"
     * Demonstrates basic function implementation without parameters
     */
    public static void printHelloworld() {
        System.out.println("Hello World");
    }
}