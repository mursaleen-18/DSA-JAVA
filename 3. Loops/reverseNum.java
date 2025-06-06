/**
 * Program to reverse a number
 * Demonstrates two approaches:
 * 1. Building reversed number (commented out)
 * 2. Printing digits in reverse order
 */
public class reverseNum {
    /**
     * Main method - entry point of the program
     * Takes a number and prints its digits in reverse order
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // First approach: Building reversed number
        // int n = 1234;
        // int reverse = 0;
        // while (n > 0) {
        //     int rem = n % 10;        // Get last digit
        //     reverse = reverse * 10 + rem;  // Build reversed number
        //     n = n / 10;             // Remove last digit
        // }
        // System.out.println("The reverse of the number is " + reverse);

        // Second approach: Printing digits in reverse order
        int n = 1234;
        while (n > 0) {
            int lastDigit = n % 10;    // Get last digit
            System.out.print(lastDigit);  // Print last digit
            n = n / 10;               // Remove last digit
        }
    }
}
