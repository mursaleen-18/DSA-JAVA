import java.util.*;

public class matrices {
     public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
        // this above line can be also writen as...
        // int n = matrix.length, m= matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        // output
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                // matrix[i][j] = sc.nextInt();
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
