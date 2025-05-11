public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {      // 5
            for (int sp = 1; sp <= n - i; sp++) {
                System.out.print(" ");
            }
            for (int st = 1; st <= n; st++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
