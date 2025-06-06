/**
 * Program demonstrating basic function definition and usage in Java
 * Shows how to create and call a function to calculate factorial
 */
public class Function {
    /**
     * Calculates factorial of a given number
     * param n number to calculate factorial for
     * return factorial of n as integer
     */
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates factorial calculation using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Calculate and print factorial of 5
        System.out.println(factorial(5));
    }
} 