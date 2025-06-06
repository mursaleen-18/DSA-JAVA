/**
 * Program to check voting eligibility based on age
 * Demonstrates the use of if-else statements for age verification
 */
import java.util.Scanner;

public class condition {
    /**
     * Main method - entry point of the program
     * Takes age as input and checks voting eligibility
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        
        // Read age from user input
        int age = sc.nextInt();
        
        // Check voting eligibility (18 years or older)
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }
}