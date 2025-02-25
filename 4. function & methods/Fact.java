public class Fact {

    public static int fact(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 6;
        int f = fact(n);
        System.out.println("factorial of " + n + " is : " + f);
    }
}
