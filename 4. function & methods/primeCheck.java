/**
 * Program demonstrating function to check if a number is prime
 * Shows how to create and use a function with boolean return type
 */
public class primeCheck {
    /**
     * Checks if a given number is prime
     * param n number to check
     * return true if number is prime, false otherwise
     */
    public static boolean isPrime(int n) {
        // 2 is the only even prime number
        if (n == 2) {
            return true;
        }
        
        // Check if number is divisible by any number from 2 to n-1
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates prime number checking using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Check if 5 is prime
        System.out.println(isPrime(5));
    }
}
