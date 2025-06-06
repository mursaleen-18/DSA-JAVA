/**
 * Program to print a half number pyramid pattern
 * Shows how to create a pattern with numbers in a half pyramid shape
 */
public class halfNumPiramid {
    /**
     * Main method - entry point of the program
     * Prints a half number pyramid pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 5;  // Height of the pyramid
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();  // Move to next line
        }
    }
}
