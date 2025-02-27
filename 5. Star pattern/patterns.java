public class patterns {
    public static void hollow_rectangle(int rows, int cols) {
        // outer loop
        for (int i = 1; i <= rows; i++) {

            // inner loop
            for (int j = 1; j <= cols; j++) {
                // cell (i,j);
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    // boundery cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
