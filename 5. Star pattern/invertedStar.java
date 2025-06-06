/**
 * Program to print an inverted star pattern
 * Shows how to create an inverted pattern using stars
 */
public class invertedStar {
    /**
     * Main method - entry point of the program
     * Prints an inverted star pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Height of the pattern
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
    }
}
