/**
 * Program demonstrating function with multiple parameters
 * Shows how to create and call a function to calculate binomial coefficient
 */
public class Function2 {
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
     * Calculates binomial coefficient (nCr)
     * param n total number of items
     * param r number of items to choose
     * return binomial coefficient as integer
     */
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates binomial coefficient calculation using functions
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Calculate and print binomial coefficient for n=5, r=2
        System.out.println(binCoeff(5, 2));
    }
} 