/**
 * Program demonstrating function to calculate product of two numbers
 * Shows how to create and use a function with two parameters
 */
public class Product {
    /**
     * Calculates product of two numbers
     * param a first number
     * param b second number
     * return product of a and b as integer
     */
    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates multiplication using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Calculate and print product of 5 and 7
        System.out.println(multiply(5, 7));
    }
}
