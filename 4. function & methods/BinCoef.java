import java.util.*;

public class BinCoef {

    // Factorial.
    public static double fact(double n) {
        double fact = 1;

        for (double i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of N and R in nCr: ");
        double n = sc.nextInt();
        double r = sc.nextInt();
        System.out.println("The bionomial coefficient is: ");
        double a = fact(n);
        double b = fact(r);
        double c = fact(n-r);

        double BC = a/(b*c);

        System.out.println(BC);

        sc.close();
    }
}
