public class diamond {
    public static void main(String[] args) {
        int i, j, n = 4;
        // first half of the diamond
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (n - i); j++)  // (n-i) spaces
                System.out.print("  ");
            for (j = 1; j <= (2 * i - 1); j++)  // ((2*i)-1) stars
                System.out.print(" *");
    
            System.out.println();
        }
        // second half of the diamond
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= (n - i); j++)
                System.out.print("  ");
            for (j = 1; j <= (2 * i - 1); j++)  
                System.out.print(" *");
            
            System.out.println();
        }
    }
}
