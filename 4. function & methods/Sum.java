import java.util.*;

public class Sum {
    public static void hello() {
        System.out.println("hello world!!!");
    }

    public static int sum(int a, int b) { // parameters or formal parameters.
        int sum = a + b;
        // System.out.println("sum is: " + sum);
        // sc.close(); // Close the scanner to avoid resource leaks.
        return sum;
    }

    public static void main(String[] args) {
        hello();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a, b); // arguments or actual parameters.
        System.out.println("the sum is: " + sum);
        sc.close();
        // sum1(a,b);
    }
}