/**
 * Program to reverse an array in-place
 * Shows how to implement array reversal using two-pointer technique
 */
public class reverseArray {
    /**
     * Main method - entry point of the program
     * Demonstrates reversing an array in-place
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        
        // Print original array
        System.out.println("Original array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        
        // Reverse array using two-pointer technique
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            // Swap elements at start and end
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            
            // Move pointers towards center
            start++;
            end--;
        }
        
        // Print reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
