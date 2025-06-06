/**
 * Program demonstrating function to calculate binomial coefficient
 * Shows how to create and use a function with multiple parameters
 */
import java.util.*;

public class BinCoef {
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
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input
        System.out.println("Enter the values of N and R in nCr: ");
        
        // Read values of n and r from user input
        int n = sc.nextInt(); // Read value of n
        int r = sc.nextInt(); // Read value of r

        System.out.println("The bionomial coefficient is: ");

        // Calculate binomial coefficient using the binCoeff function
        int BC = binCoeff(n, r);

        System.out.println(BC); // Print the result

        sc.close(); // Close the Scanner
    }
}
