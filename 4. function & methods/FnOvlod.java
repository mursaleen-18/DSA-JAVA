/**
 * Program demonstrating function overloading with different data types
 * Shows how to define multiple functions with same name but different parameter types
 */
public class FnOvlod {
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
     * Calculates sum of two floating-point numbers
     * param a first float number
     * param b second float number
     * return sum of a and b as float
     */
    public static float sum(float a, float b) {
        return a + b;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates function overloading with different data types
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Call sum function with integer parameters
        System.out.println(sum(5, 7));
        
        // Call sum function with float parameters
        System.out.println(sum(5.2f, 7.3f));
    }
}
