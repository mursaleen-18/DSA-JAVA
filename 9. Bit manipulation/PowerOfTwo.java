public class PowerOfTwo {

    // this function checks if number is power of two or not.
    public static boolean isPowerTwo(int n) {
        // in case of void function type
        // if ((n&(n-1)) == 0) {
        // System.out.println("Yes, "+n+" is power is power of two.");
        // }
        // else System.out.println("No, "+n+" is not power of two.");
        // }

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // isPowerTwo(15);
        // isPowerTwo(16);
        System.out.println(isPowerTwo(15));
        System.out.println(isPowerTwo(16));
    }
}
