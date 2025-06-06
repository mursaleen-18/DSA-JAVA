    /**
 * Program demonstrating function overloading with different number of parameters
 * Shows how to define multiple functions with same name but different parameter counts
 */
public class FnOvlod2 {
    /**
     * Calculates sum of two integers
     * param a first integer
     * param b second integer
     * return sum of a and b as integer
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * Calculates sum of three integers
     * param a first integer
     * param b second integer
     * param c third integer
     * return sum of a, b and c as integer
     */
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates function overloading with different number of parameters
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Call sum function with two parameters
        System.out.println(sum(5, 7));
        
        // Call sum function with three parameters
        System.out.println(sum(5, 7, 9));
    }
} 