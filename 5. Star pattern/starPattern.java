/**
 * Program to print a star pattern
 * Shows how to create a pattern using stars
 */
public class starPattern {
    /**
     * Main method - entry point of the program
     * Prints a star pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Height of the pattern
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
    }
}
