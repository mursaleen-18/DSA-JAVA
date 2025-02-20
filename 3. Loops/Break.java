import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                System.out.println("You have reached the number " + n);
                break;
            }
        }
        sc.close();
    }
}
