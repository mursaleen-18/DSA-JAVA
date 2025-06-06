/**
 * Program demonstrating function to check if a number is palindrome
 * Shows how to create and use a function with boolean return type
 */
public class Function9 {
    /**
     * Checks if a given number is palindrome
     * param n number to check
     * return true if number is palindrome, false otherwise
     */
    public static boolean isPalindrome(int n) {
        int palindrome = n;
        int reverse = 0;
        
        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        
        if (n == reverse) {
            return true;
        }
        return false;
    }

    /**
     * Main method - entry point of the program
     * Demonstrates palindrome number checking using a function
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Check if 121 is palindrome
        System.out.println(isPalindrome(121));
    }
} 