/**
 * Program to calculate income tax based on different income slabs
 * Demonstrates the use of if-else statements for tax calculation
 */
import java.util.*;

public class tax {
    /**
     * Main method - entry point of the program
     * Takes income as input and calculates tax based on income slabs
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        System.out.println("Enter your income: ");
        Scanner sc = new Scanner(System.in);
        
        // Read income from user input
        double income = sc.nextDouble();
        double tax = 0;
        
        // Calculate tax based on income slabs
        if (income <= 500000) {
            // No tax for income up to 500,000
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000) {
            // 20% tax for income between 500,000 and 1,000,000
            tax = (income * 0.2);
        }
        else {
            // 30% tax for income above 1,000,000
            tax = (income * 0.3);
        }
        
        // Display the calculated tax
        System.out.println("Tax to be paid: " + tax);
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
