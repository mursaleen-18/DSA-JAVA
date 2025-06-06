/**
 * Program to print an inverted pyramid pattern using stars
 * Shows how to create an inverted pyramid shape using nested loops
 */
public class invertedPiramid {
    /**
     * Main method - entry point of the program
     * Prints an inverted pyramid pattern using stars
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Height of the pyramid
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
    }
}
