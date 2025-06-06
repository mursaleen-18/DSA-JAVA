public class SearchMatrix {

    // Method to search for a key in a sorted 2D matrix using staircase search
    public static boolean staircaseSearch(int matrix[][], int key){
        int row = 0, col = matrix[0].length-1; // Start from top-right corner

        // Loop until we go out of matrix bounds
        while (row < matrix.length && col >= 0) {
            if (key == matrix[row][col]) {
                // Key found at current position
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            }
            else if (key < matrix[row][col]) {
                // If key is smaller, move left
                col--;
            }
            else{
                // If key is larger, move down
                row++;
            }
        }
        // Key not found after traversing possible positions
        System.out.println("key not found!");
        return false;
    }

    public static void main(String[] args) {
        // Example 2D matrix (sorted row-wise and column-wise)
        int matrix[][] = {{10,20,30,40},
                         {15,25,35,45},
                         {27,29,37,48},
                         {32,33,39,50}};
        int key = 33; // Key to search for
        staircaseSearch(matrix,key); // Call search method
    }
}
