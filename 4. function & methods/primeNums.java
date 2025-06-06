/**
 * Program demonstrating function to print prime numbers in a range
 * Shows how to create and use a function to print prime numbers
 */
public class primeNums {
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
     * Prints all prime numbers in a given range
     * param n upper limit of the range (inclusive)
     */
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    /**
     * Main method - entry point of the program
     * Demonstrates printing prime numbers in a range
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Print all prime numbers from 2 to 20
        primesInRange(20);
    }
}
