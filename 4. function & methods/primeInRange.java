public class primeInRange {

    // Helper function to check prime.
    public static boolean isPrime(int n) {

        if (n <= 1)
            return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Prime in Range .
    public static void PrimeInRange(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        // System.out.println();
    }

    // Main method.
    public static void main(String[] args) {
        PrimeInRange(500);
    }
}
