// did this program by myself on the first try.

public class hollowRectangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (1 == i || 4 == i || 1 == j || 5 == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(" \n");
        }
    }
}
