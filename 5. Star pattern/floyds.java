/**
 * Program to print Floyd's triangle pattern
 * Shows how to create a pattern with numbers in Floyd's triangle shape
 */
public class floyds {
    /**
     * Main method - entry point of the program
     * Prints Floyd's triangle pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 5;  // Height of the triangle
        int number = 1;  // Starting number
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;  // Increment number
            }
            
            System.out.println();  // Move to next line
        }
    }
}
