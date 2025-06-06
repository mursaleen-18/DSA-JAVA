/**
 * Program to find the maximum sum of a contiguous subarray using prefix sum
 * Shows how to implement prefix sum for maximum subarray sum
 */
public class maxSubarrayPrefix {
    /**
     * Main method - entry point of the program
     * Demonstrates finding maximum subarray sum using prefix sum
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        int prefix[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;
        
        // Calculate prefix sum
        prefix[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }
        
        // Find maximum subarray sum
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int currentSum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                maxSum = Math.max(maxSum, currentSum);
            }
        }
        
        // Print the maximum sum
        System.out.println("Max sum = " + maxSum);
    }
}
