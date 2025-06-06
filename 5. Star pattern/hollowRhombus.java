/**
 * Program to print a hollow rhombus pattern using stars
 * Shows how to create a hollow rhombus shape using nested loops
 */
public class hollowRhombus {
    /**
     * Main method - entry point of the program
     * Prints a hollow rhombus pattern using stars
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
            
            // Print stars and spaces for hollow rhombus
            for (int j = 1; j <= n; j++) {
                // Print stars only for first and last row, or first and last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();  // Move to next line
        }
    }
}
