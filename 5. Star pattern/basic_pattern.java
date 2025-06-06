/**
 * Program to print a basic star pattern
 * Shows how to create a simple pattern using nested loops
 */
public class basic_pattern {
    /**
     * Main method - entry point of the program
     * Prints a basic star pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Size of the pattern
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for each column
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to next line
        }
    }
}
