/**
 * Program demonstrating the use of break statement in loops
 * Shows how to exit a loop when a specific condition is met
 */
import java.util.Scanner;

public class Break {
    /**
     * Main method - entry point of the program
     * Takes a number as input and demonstrates break statement usage
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        // Read number from user input
        int n = sc.nextInt();
        
        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            // Check if current number equals input number
            if (i == n) {
                System.out.println("You have reached the number " + n);
                break;  // Exit loop when condition is met
            }
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
