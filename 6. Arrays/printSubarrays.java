/**
 * Program to print all possible subarrays of an array
 * Shows how to generate and print all possible contiguous subarrays
 */
public class printSubarrays {
    /**
     * Main method - entry point of the program
     * Demonstrates printing all possible subarrays
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        // Generate and print all possible subarrays
        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                // Print current subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
} 