/**
 * Program to search for a key in a sorted matrix
 * Shows how to implement efficient search in a 2D sorted array
 */
public class searchInSortedMatrix {
    /**
     * Main method - entry point of the program
     * Demonstrates searching for a key in a sorted matrix
     * param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int key = 33;
        
        // Search for key in matrix
        int row = 0;
        int col = matrix[0].length - 1;
        boolean found = false;
        
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Found at (" + row + "," + col + ")");
                found = true;
                break;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        
        if (!found) {
            System.out.println("Key not found");
        }
    }
} 