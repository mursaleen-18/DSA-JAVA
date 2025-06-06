import java.util.*;

/**
 * Program to calculate the amount of rainwater trapped between bars
 * Shows how to solve the trapping rainwater problem using arrays
 */
public class trappingRainwater {
    /**
     * Main method - entry point of the program
     * Demonstrates calculating trapped rainwater
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int n = height.length;
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        // Calculate left maximum heights
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        
        // Calculate right maximum heights
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        
        // Calculate trapped water
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        
        // Print the amount of trapped water
        System.out.println("Trapped water: " + trappedWater);
    }
}
