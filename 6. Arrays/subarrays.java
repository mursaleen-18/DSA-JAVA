/**
 * Program to find the sum of all possible subarrays
 * Shows how to calculate sum of all contiguous subarrays
 */
public class subarrays {
    /**
     * Main method - entry point of the program
     * Demonstrates calculating sum of all subarrays
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        // Calculate and print sum of all subarrays
        for (int start = 0; start < numbers.length; start++) {
            int sum = 0;
            for (int end = start; end < numbers.length; end++) {
                sum += numbers[end];
                System.out.println("Sum of subarray from " + start + " to " + end + " = " + sum);
            }
        }
    }
}
