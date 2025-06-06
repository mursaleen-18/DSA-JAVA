/**
 * Program demonstrating function to calculate sum of numbers
 * Shows how to create and use a function with multiple parameters
 */
import java.util.*;

public class Sum {
    /**
     * Simple function to print a greeting message
     * Demonstrates a void function with no parameters
     */
    public static void hello() {
        System.out.println("hello world!!!");
    }

    /**
     * Calculates sum of two numbers
     * param a first number
     * param b second number
     * return sum of a and b as integer
     */
    public static int sum(int a, int b) {
        int sum = a + b;
        // System.out.println("sum is: " + sum);
        // sc.close(); // Close the scanner to avoid resource leaks.
        return sum;
    }

    /**
     * Calculates sum of three numbers
     * param a first number
     * param b second number
     * param c third number
     * return sum of a, b and c as integer
     */
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Calculates sum of four numbers
     * param a first number
     * param b second number
     * param c third number
     * param d fourth number
     * return sum of a, b, c and d as integer
     */
    public static int sum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates sum calculation using functions
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        hello();  // Call the hello function
        Scanner sc = new Scanner(System.in);
        
        // Read two numbers from user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        // Calculate sum using the sum function
        int sum = sum(a, b); // arguments or actual parameters.
        System.out.println("the sum is: " + sum);
        
        // Calculate and print sum of three numbers
        System.out.println(sum(a, b, sc.nextInt()));
        
        // Calculate and print sum of four numbers
        System.out.println(sum(a, b, sc.nextInt(), sc.nextInt()));
        
        sc.close(); // Close scanner to prevent resource leak
        // sum1(a,b);
    }
}