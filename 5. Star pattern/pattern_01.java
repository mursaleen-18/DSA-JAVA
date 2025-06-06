/**
 * Program to print a number pattern
 * Shows how to create a pattern with numbers in a specific sequence
 */
public class pattern_01 {
    /**
     * Main method - entry point of the program
     * Prints a number pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 5;  // Size of the pattern
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces before numbers
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();  // Move to next line
        }
    }
}
