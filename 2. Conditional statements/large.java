/**
 * Program to find the largest of three numbers
 * Demonstrates the use of if-else statements with multiple conditions
 */
import java.util.Scanner;

public class large {
    /**
     * Main method - entry point of the program
     * Takes three numbers as input and finds the largest one
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.println("Enter three numbers: ");
        Scanner sc = new Scanner(System.in);
        
        // Read three numbers from user input
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Compare numbers to find the largest
        if (a > b && a > c) {
            // First number is largest
            System.out.println(a + " is the largest number.");
        } else if (b > a && b > c) {
            // Second number is largest
            System.out.println(b + " is the largest number.");
        } else {
            // Third number is largest
            System.out.println(c + " is the largest number.");
        }   
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
