/**
 * Program demonstrating function to calculate sum of digits in a number
 * Shows how to create and use a function to process digits
 */
public class Function10 {
    /**
     * Calculates sum of digits in a given number
     * param n number to process
     * return sum of all digits in the number
     */
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        return sum;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates sum of digits calculation using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Calculate and print sum of digits in 123
        System.out.println(sumOfDigits(123));
    }
} 