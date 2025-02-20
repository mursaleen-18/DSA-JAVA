import java.util.Scanner;
public class largest2 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println(max + " is the largest number.");
        sc.close();
    }
}
 