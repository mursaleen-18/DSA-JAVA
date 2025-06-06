/**
 * Program demonstrating function to calculate average of three numbers
 * Shows how to create and use a function with multiple parameters
 */
public class Function7 {
    /**
     * Calculates average of three numbers
     * param a first number
     * param b second number
     * param c third number
     * return average of the three numbers as float
     */
    public static float average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates average calculation using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Calculate and print average of 3, 4, and 5
        System.out.println(average(3, 4, 5));
    }
} 