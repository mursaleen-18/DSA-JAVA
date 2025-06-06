/**
 * Program to print a square pattern using nested loops
 * Demonstrates the use of nested for loops to create a 4x4 square pattern
 */
public class square {
    /**
     * Main method - entry point of the program
     * Prints a 4x4 square pattern using asterisks
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Outer loop for rows
        for (int i = 1; i <= 4; i++) {
            System.out.print("\n");  // Move to next line
            
            // Inner loop for columns
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");  // Print asterisk
            }
        }
    }
}
