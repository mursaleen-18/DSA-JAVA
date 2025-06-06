/**
 * Program to print a hollow rectangle pattern using stars
 * Shows how to create a hollow rectangle shape using nested loops
 */
public class hollowRectangle {
    /**
     * Main method - entry point of the program
     * Prints a hollow rectangle pattern using stars
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 4;  // Number of rows
        int m = 5;  // Number of columns
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Inner loop for each column
            for (int j = 1; j <= m; j++) {
                // Print stars only for first and last row, or first and last column
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();  // Move to next line
        }
    }
}
