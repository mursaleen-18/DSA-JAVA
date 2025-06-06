/**
 * Program to find the maximum sum of a contiguous subarray using Kadane's algorithm
 * Shows how to implement Kadane's algorithm for maximum subarray sum
 */
public class maxSumKadanes {
    /**
     * Main method - entry point of the program
     * Demonstrates finding maximum subarray sum using Kadane's algorithm
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        
        // Loop through each element
        for (int i = 0; i < numbers.length; i++) {
            // Update current sum
            currentSum += numbers[i];
            
            // Update maxSum if current sum is greater
            if (maxSum < currentSum) {
                maxSum = currentSum;
            }
            
            // Reset current sum if it becomes negative
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        // Print the maximum sum
        System.out.println("Max sum = " + maxSum);
    }
}
