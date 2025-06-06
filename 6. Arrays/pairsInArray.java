/**
 * Program to find all possible pairs in an array
 * Shows how to generate and print all possible pairs of elements
 */
public class pairsInArray {
    /**
     * Main method - entry point of the program
     * Demonstrates finding all possible pairs in an array
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        // Generate and print all possible pairs
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ") ");
            }
            System.out.println();
        }
    }
} 