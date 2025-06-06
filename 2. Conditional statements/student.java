/**
 * Program to determine if a student has passed or failed based on marks
 * Demonstrates the use of ternary operator for conditional output
 */
import java.util.*;

public class student {
    /**
     * Main method - entry point of the program
     * Takes marks as input and determines pass/fail status
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.println("Enter your marks: ");
        Scanner sc = new Scanner(System.in);
        
        // Read marks from user input
        int marks = sc.nextInt();
        
        // Use ternary operator to determine pass/fail status
        // If marks >= 33, student passes; otherwise fails
        String type = (marks >= 33) ? "pass" : "fail";
        
        // Display the result
        System.out.println("You " + type + " the exam.");
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
