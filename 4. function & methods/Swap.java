/**
 * Program demonstrating function to swap two numbers
 * Shows how to create and use a function to modify variables
 */
public class Swap {
    /**
     * Swaps two numbers using a temporary variable
     * param a first number
     * param b second number
     */
    public static void swap(int a, int b) {
        // Print original values
        System.out.println("Before swap: a = " + a + ", b = " + b);
        
        // Swap using temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        // Print swapped values
        System.out.println("After swap: a = " + a + ", b = " + b);
    }

    /**
     * Main method - entry point of the program
     * Demonstrates swapping two numbers using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Swap numbers 5 and 7
        swap(5, 7);
    }
}
