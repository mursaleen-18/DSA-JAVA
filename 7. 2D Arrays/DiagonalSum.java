import java.*;

public class DiagonalSum {

    public static int SumDiagonal(int matrix[][]) {
        int sum = 0;

        // this code works but it's not well optimised (brute force).
        // for(int i=0; i<matrix.length; i++){

        // for(int j=0; j<matrix[0].length; j++){

        // // for the sum of primary Diagonal
        // if (i == j) {
        // sum += matrix[i][j];
        // }

        // // for the sum of secondary diagonal
        // else if (i+j == matrix.length-1) {
        // sum += matrix[i][j];
        // }
        // }
        // }

        // well optimised code with linear complexity.
        for(int i = 0; i<matrix.length; i++){
            // primary diagonal.
            sum+= matrix[i][i];

            // secondary diagonal.
            if(i != matrix.length-1-i)
                sum+= matrix[i][matrix.length-i-1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };
        System.out.println(SumDiagonal(matrix));

    }
}
