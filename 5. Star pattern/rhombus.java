/**
 * Program to print a rhombus pattern using stars
 * Shows how to create a rhombus shape using nested loops
 */
public class rhombus {
    /**
     * Main method - entry point of the program
     * Prints a rhombus pattern using stars
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 5;  // Size of the rhombus
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            System.out.println();  // Move to next line
        }
    }
}
