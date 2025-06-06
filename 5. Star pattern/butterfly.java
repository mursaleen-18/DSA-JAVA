/**
 * Program to print a butterfly pattern using stars
 * Shows how to create a butterfly shape using nested loops
 */
public class butterfly {
    /**
     * Main method - entry point of the program
     * Prints a butterfly pattern using stars
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Half width of the butterfly
        
        // Upper half of butterfly
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
        
        // Lower half of butterfly
        for (int i = n; i >= 1; i--) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
    }
}
