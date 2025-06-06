/**
 * Program to print a character triangle pattern
 * Shows how to create a pattern with characters in a triangle shape
 */
public class charTriangle {
    /**
     * Main method - entry point of the program
     * Prints a character triangle pattern
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int n = 5;  // Height of the triangle
        char ch = 'A';  // Starting character
        
        // Outer loop for each row
        for (int i = 1; i <= n; i++) {
            // Print characters
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;  // Move to next character
            }
            
            System.out.println();  // Move to next line
        }
    }
}
