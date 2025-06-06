/**
 * Program to print various patterns using stars and numbers
 * Shows how to create different patterns using nested loops
 */
public class patterns {
    /**
     * Main method - entry point of the program
     * Prints various patterns using stars and numbers
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Size of the patterns
        
        // Pattern 1: Right triangle with stars
        System.out.println("Pattern 1:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Pattern 2: Inverted right triangle with stars
        System.out.println("\nPattern 2:");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Pattern 3: Right triangle with numbers
        System.out.println("\nPattern 3:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
