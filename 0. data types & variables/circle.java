/**
 * This program calculates the area and circumference of a circle
 * Demonstrates the use of Math.PI constant and basic arithmetic operations
 */
import java.util.Scanner;

public class circle {
    /**
     * Main method - entry point of the program
     * Takes radius as input and calculates area and circumference
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();  // Read radius from user input
        
        // Calculate area using formula: πr²
        double area = Math.PI * radius * radius;
        
        // Calculate circumference using formula: 2πr
        double circumference = 2 * Math.PI * radius;
        
        // Display results
        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
        
        sc.close();  // Close scanner to prevent resource leak
    }
}
