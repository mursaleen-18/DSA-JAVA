import java.util.*;

public class Add {
    public static void main(String[] args) {
        printHelloworld();

    }

    public static void sum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        sc.close();
        System.out.println("sum is :" + sum);
    }

    public static void printHelloworld() {
        System.out.println("Hello World");
    }
}