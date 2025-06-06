/**
 * Program to print a palindromic number pyramid pattern
 * Shows how to create a pattern with numbers in a pyramid shape
 */
public class palyndromicNumPyramid {
    /**
     * Main method - entry point of the program
     * Prints a palindromic number pyramid pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 5;  // Height of the pyramid
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces before numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers in ascending order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Print numbers in descending order (excluding first number)
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();  // Move to next line
        }
    }
}
