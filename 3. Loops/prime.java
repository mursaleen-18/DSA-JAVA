/**
 * Program to check if a number is prime
 * Uses optimized approach by checking divisibility up to square root of number
 */
import java.util.*;

public class prime {
    /**
     * Main method - entry point of the program
     * Takes a number as input and checks if it's prime
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        
        // Read number from user input
        int n = sc.nextInt();

        // Flag to track if number is prime
        boolean flag = false;
        
        // Check divisibility from 2 to square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // Number is divisible, hence not prime
                flag = true;
                break;
            }
        }
        
        // Display result based on flag value
        if (flag == true) {
            System.out.println(n + " is not a prime number");
        } else {
            System.out.println(n + " is a prime number");
        }
        
        sc.close(); // Close scanner to prevent resource leak
    }
}
