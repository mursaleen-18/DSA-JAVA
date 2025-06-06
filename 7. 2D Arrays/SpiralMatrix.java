public class SpiralMatrix {

    // Method to print the elements of a 2D matrix in spiral order
    public static void printSpiral(int matrix[][]) {
        int startRow = 0; // Starting row index
        int startCol = 0; // Starting column index
        int endRow = matrix.length - 1; // Ending row index
        int endCol = matrix[0].length - 1; // Ending column index

        // Continue looping until the entire matrix is traversed
        while (startRow <= endRow && startCol <= endCol) {
            // Print the top row from left to right
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Print the rightmost column from top to bottom
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Print the bottom row from right to left, only if there is more than one row left
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break; // Avoid double printing if only one row remains
                }
                System.out.print(matrix[endRow][j] + " ");
            }

            // Print the leftmost column from bottom to top, only if there is more than one column left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                System.out.print(matrix[i][startCol] + " ");
                if (startCol == endCol) {
                    break; // Avoid double printing if only one column remains
                }
            }

            // Move the boundaries inward for the next spiral layer
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println(); // Print newline after spiral traversal
    }

    public static void main(String[] args) {
        // Example 4x4 matrix
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        printSpiral(matrix); // Call the spiral print method
    }
}
