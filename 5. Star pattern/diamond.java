/**
 * Program to print a diamond pattern using stars
 * Shows how to create a diamond shape using nested loops
 */
public class diamond {
    /**
     * Main method - entry point of the program
     * Prints a diamond pattern using stars
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Half height of the diamond
        
        // Upper half of diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
        
        // Lower half of diamond
        for (int i = n; i >= 1; i--) {
            // Print spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
    }
}
